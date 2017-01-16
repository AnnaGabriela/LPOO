package dados;

import entidades.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import repositorios.*;

public class Database {

    //nome: caminho+nome do arquivo       
    //str: Conteudo a ser gravado
    private static final String caminho = "src" + System.getProperty("file.separator") + "data" + System.getProperty("file.separator");

    public static void gravarDados(String nome, String str) {
        FileWriter arq;
        try {
            arq = new FileWriter(nome + ".txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(str);
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro na gravação do arquivo ...");
        }
    }
    //caminho: caminho do arquivo em disco
    //Retorna um array com o conteudo do arquivo separado por linhas

    public static void gravarDadosExcel(String nome, String str) {
        FileWriter arq;
        try {
            arq = new FileWriter(nome + ".csv");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(str);
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro na gravação do arquivo ...");
        }
    }

    public static String[] lerDados(String caminho) {
        ArrayList<String> list = new ArrayList<String>();
        String[] retorno = null;
        BufferedReader in;
        File f = new File(caminho);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            in = new BufferedReader(new FileReader(caminho));
            while (in.ready()) {
                String line = in.readLine();
                list.add(line);
            }
            in.close();
            retorno = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                retorno[i] = list.get(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    // public static String[] lerDados (String caminho){
    // }
    public static void SalvarEstado(RepositorioCliente repositorioCliente) {
        String cliente = repositorioCliente.getProximoID() + "\r\n";

        Cliente[] clientes = repositorioCliente.getClienteCopia();

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                cliente += clientes[i] + "\r\n";
            }
        }

        //System.out.println("ArquivoCliente criado!");
        gravarDados(caminho + "ArquivoCliente", cliente);
        gravarDadosExcel(caminho + "ArquivoClienteExcel", cliente);

    }

    public static void SalvarEstado(RepositorioRestaurante repositorioRestaurante) {
        String restaurante = repositorioRestaurante.getProximoID() + "\r\n";

        Restaurante[] restaurantes = repositorioRestaurante.getRestaurantesCopia();

        for (int i = 0; i < restaurantes.length; i++) {
            if (restaurantes[i] != null) {
                restaurante += restaurantes[i] + "\r\n";
            }
        }

        //System.out.println("ArquivoRestaurante criado!");
        gravarDados(caminho + "ArquivoRestaurante", restaurante);
        gravarDadosExcel(caminho + "ArquivoRestauranteExcel", restaurante);

    }

    public static void SalvarEstado(RepositorioPedido repositorioPedido) {
        String pedido = repositorioPedido.getProximoID() + "\r\n";

        Pedido[] pedidos = repositorioPedido.getPedidoCopia();

        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] != null) {
                pedido += pedidos[i] + "\r\n";
            }
        }

        gravarDados(caminho + "ArquivoPedido", pedido);
        //System.out.println("ArquivoPedido criado!");
    }

    public static void SalvarEstado(Gerente gerente) {
        SalvarEstado(gerente.getClientes());
        SalvarEstado(gerente.getRestaurantes());

    }

    public static RepositorioCliente LerBaseClientes() {
        String[] clientes = lerDados(caminho + "ArquivoCliente.txt");
        if (clientes.length <= 0) {
            return new RepositorioCliente();
        }
        RepositorioCliente retorno = new RepositorioCliente();
        for (String cliente1 : clientes) {
            String[] c = cliente1.split(";");
            Cliente cliente = null;
            if (c.length > 3) {
                cliente = new Cliente(c[1], c[2], c[3], Long.parseLong(c[0]));
            }
            retorno.adicionarClienteFixo(cliente);
        }

        if (clientes.length > 0) {
            retorno.setProximoID(Long.parseLong(clientes[0]));
        }

        return retorno;
    }

    public static RepositorioRestaurante LerBaseRestaurante() {
        String[] linhas = lerDados(caminho + "ArquivoRestaurante.txt");
        if (linhas.length <= 0) {
            return new RepositorioRestaurante();
        }
        RepositorioRestaurante retorno = new RepositorioRestaurante();
        retorno.setProximoID(Long.parseLong(linhas[0]));
        for (int i = 1; i < linhas.length; i++) {
            String[] r = linhas[i].split(";");
            Restaurante restaurante = new Restaurante(r[1], r[2], r[3], Long.parseLong(r[0]));
            restaurante.setProximoPratoId(Long.parseLong(r[4]));
            for (int j = 5; j < r.length; j++) {
                String[] item = r[j].split("/");
                restaurante.adicionarPratoFixo(new ItemCardapio(item[1], Long.parseLong(item[0]), Double.parseDouble(item[2])));
            }
            retorno.adicionarRestauranteFixo(restaurante);
        }
        return retorno;
    }

    public static RepositorioPedido LerBasePedido() {
        String[] pedidos = lerDados(caminho + "ArquivoPedido.txt");
        RepositorioPedido retornoP = new RepositorioPedido();
        for (int i = 0; i < pedidos.length; i++) {
            String[] p = pedidos[i].split(";");
            Pedido pedido = null;
            if (p.length > 3) {
                pedido = new Pedido(Long.parseLong(p[2]), Long.parseLong(p[1]), Long.parseLong(p[0]));
            }
            for (int j = 4; j < pedidos[i].length(); j++) {
                String[] dadosItens = pedidos[i].split("/");
                ItemCardapio novoItem = new ItemCardapio(p[1], Long.parseLong(p[0]), Double.parseDouble(p[2]));
                pedido.setItem(novoItem);

            }
            retornoP.adicionar(pedido);
        }
        if (pedidos.length > 0) {
            retornoP.setProximoID(Long.parseLong(pedidos[0]));
        }
        return retornoP;
    }

    public static Gerente LerBaseGerente() {
        Gerente gerente = new Gerente();
        gerente.setCliente(LerBaseClientes());
        gerente.setRestaurante(LerBaseRestaurante());
        return gerente;
    }
}
