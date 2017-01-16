package br.acme.users;

import br.acme.storage.*;

public class Gerente extends Usuario {

    public Gerente(long id, String cpf, String nome, String senha, String email, String sexo) {
        super(id, cpf, nome, senha, email, sexo);
    }
    
    public void cadastrarMotorista(Motorista motorista, RepositorioMotorista repoMotorista) {
        repoMotorista.adicionar(motorista);
    }

    public void removerMotorista(long id, RepositorioMotorista repoMotorista) {
        repoMotorista.remover(id);
    }

    public void listarMotoristas(RepositorioMotorista repoMotorista) {
        repoMotorista.buscarTodos();
    }

    public void listarClientes(RepositorioSolicitante lista) {
        lista.buscarTodos();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
