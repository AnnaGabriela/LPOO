package entidades;

import dados.Database;
import interfaces.RepClienteInterface;
import interfaces.RepRestauranteInterface;
import repositorios.*;

public class Gerente {

    RepClienteInterface clientes = new RepositorioCliente();
    RepRestauranteInterface restaurantes = new RepositorioRestaurante();

    public Gerente() {
        this.restaurantes = Database.LerBaseRestaurante();
        this.clientes = Database.LerBaseClientes();
    }

// ------------- MÉTODOS --------------
    public void adicionarCliente(Cliente cliente) {
        clientes.adicionarCliente(cliente);
        Database.SalvarEstado((RepositorioCliente) this.clientes);
    }

    public void removerCliente(int idCliente) {
        clientes.removerCliente(idCliente);
        Database.SalvarEstado((RepositorioCliente) clientes);
    }

    public void listarClientes() {
        clientes.listarClientes();
        Database.SalvarEstado((RepositorioCliente) this.clientes);
    }

    public void adicionarPrato(int idRestaurante, ItemCardapio item) {
        restaurantes.adicionarPrato(idRestaurante, item);
    }

    public void removerPrato(int idRestaurante, int idPrato) {
        restaurantes.removerPrato(idRestaurante, idPrato);
    }

    public void adicionarRestaurante(Restaurante restaurante) {
        restaurantes.adicionarRestaurante(restaurante);
        Database.SalvarEstado((RepositorioRestaurante) this.restaurantes);
    }

    public void removerRestaurante(int idRestaurante) {
        restaurantes.removerRestaurante(idRestaurante);
        Database.SalvarEstado((RepositorioRestaurante) this.restaurantes);
    }

    public void listarRestaurantes() {
        restaurantes.listarRestaurantes();
        Database.SalvarEstado((RepositorioRestaurante) restaurantes);
    }

    public RepositorioCliente getClientes() {
        return (RepositorioCliente) clientes;
    }

    public RepositorioRestaurante getRestaurantes() {
        return (RepositorioRestaurante) restaurantes;
    }

    public Restaurante buscar(long idRest) {
        return restaurantes.buscar(idRest);
    }

    public long buscarPeloLogin(String login) {
        return restaurantes.buscarPeloLogin(login);
    }
    
    public Cliente clientePeloLogin (String login) {
        return clientes.clientePeloLogin(login);
    }

    public void setCliente(RepositorioCliente cliente) {
        this.clientes = cliente;
    }

    public void setRestaurante(RepositorioRestaurante restaurante) {
        this.restaurantes = restaurante;
    }
}
