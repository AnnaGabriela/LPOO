package repositorios;

import dados.Database;
import entidades.Cliente;
import interfaces.RepClienteInterface;

public class RepositorioCliente implements RepClienteInterface {

// ------------- ATRIBUTOS --------------
    private Cliente[] clientes;
    private long proximoID;
    private int qtdClientes;

// ------------- CONSTRUTOR --------------
    public RepositorioCliente() {
        this.clientes = new Cliente[150];
        this.qtdClientes = 0;
        this.proximoID = 1;
    }

// ------------- MÉTODOS --------------
    public void adicionarCliente(Cliente cliente) {
        if (this.qtdClientes < this.clientes.length && !contains(cliente)) {
            cliente.setId(proximoID);
            this.clientes[qtdClientes] = cliente;
            qtdClientes++;
            this.proximoID++;
            System.out.println(cliente.nome + " foi adicionado");

        }
    }

    public void adicionarClienteFixo(Cliente cliente) {
        if (cliente != null) {
            if (this.qtdClientes < this.clientes.length && !contains(cliente)) {
                this.clientes[qtdClientes] = cliente;
                qtdClientes++;
                System.out.println(cliente.nome + " foi adicionado\n\n");
            }
        }
    }

    public void removerCliente(int id) {
        for (int i = 0; i < qtdClientes; i++) {
            if (clientes[i].getId() == id) {
                clientes[i] = null;
                clientes[i] = clientes[qtdClientes - 1];
                clientes[qtdClientes - 1] = null;
                qtdClientes--;
                System.out.println("Cliente removido");
                Database.SalvarEstado(this);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                s += cliente.id + " - " + cliente.nome + "\n";
            }
        }
        return s;
    }

    public void alterarSenha(int id, String novaSenha) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes[id].setSenha(novaSenha);
                System.out.println(cliente.id + " - " + cliente.nome);
            }
        }
    }

    public void alterarNome(int id, String novoNome) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes[id].setNome(novoNome);
                System.out.println("Nome alterado");
            }
        }
    }

       public long buscarPeloLogin(String login) {
        for (int i = 0; i < qtdClientes; i++) {
            if (clientes[i].getLogin().equals(login)) {
                return clientes[i].id;
            }
        }
        return 0;
    }
       
    @Override
       public Cliente clientePeloLogin (String login) {
        for (int i = 0; i < qtdClientes; i++) {
            if (clientes[i].getLogin().equals(login)) {
                return clientes[i];
            }
        }
        return null;
    }
       
    public boolean contains(Cliente cliente) {
        for (int i = 0; i < qtdClientes; i++) {
            if (clientes[i].getId() == cliente.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarCliente(String login, String senha) {
        for (int i = 0; i < qtdClientes; i++) {
            if (clientes[i].getLogin().equals(login) && clientes[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public int getQtdClientes() {
        return qtdClientes;
    }

    public Cliente[] getCliente() {
        return clientes;
    }

    public void setProximoID(long proximoID) {
        this.proximoID = proximoID;
    }

    public Cliente[] getClienteCopia() {
        return clientes.clone();
    }

    public long getProximoID() {
        return proximoID;
    }

    @Override
    public void listarClientes() {
    }

}
