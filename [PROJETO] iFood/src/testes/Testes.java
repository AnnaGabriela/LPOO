package testes;

import dados.*;
import entidades.*;
import repositorios.*;

public class Testes {

 public static void main(String[] args) {

        ItemCardapio comida = new ItemCardapio("Sushi", 123, 23);
        ItemCardapio comida2 = new ItemCardapio("Hamburguer", 222, 15);
        ItemCardapio comida3 = new ItemCardapio("Milkshake", 244, 8);

        Cliente anna = new Cliente("aninhagabs", "0908", "Anna", 123);
        Cliente dudas = new Cliente("dudaottoni", "1234", "Duda", 012);

        Restaurante yantai = new Restaurante("yantai1", "123", "Yantai", 34);
        Restaurante laca = new Restaurante("laca1", "234", "Laça Burger", 44);

        Pedido p1 = new Pedido(34, 123, 12);
        Pedido p2 = new Pedido(44, 012, 22);

        Gerente g1 = new Gerente();
        
        RepositorioRestaurante r = new RepositorioRestaurante();
        RepositorioPedido p = new RepositorioPedido();
        RepositorioCliente c = new RepositorioCliente();
        
        Database.SalvarEstado(c);
        System.out.println(anna);
        System.out.println(dudas);
        anna.adicionarNoCarrinho(comida);
        anna.adicionarNoCarrinho(comida2);
        anna.adicionarNoCarrinho(comida3);
        yantai.adicionarPrato(comida3);
        yantai.adicionarPrato(comida2);
        yantai.adicionarPrato(comida);
        yantai.removerPrato(0);
        g1.adicionarRestaurante(laca);
        g1.adicionarRestaurante(yantai);
        //g1.removerRestaurante(0);
        g1.adicionarCliente(anna);
        g1.adicionarCliente(dudas);
        //g1.removerCliente(0);
        g1.listarClientes();
        g1.listarRestaurantes();
        Database.SalvarEstado(r);
        Database.SalvarEstado(p);
        Database.SalvarEstado(c);
        Database.SalvarEstado(g1);
       // Database.LerBaseRestaurante();
       // Database.LerBaseClientes();
       r.listarCardapio(34);
    }
       



}
