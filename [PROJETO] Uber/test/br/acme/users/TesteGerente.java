package br.acme.users;

import br.acme.storage.RepositorioMotorista;
import br.acme.storage.RepositorioSolicitante;
import java.util.Date;

public class TesteGerente {

    public static void main(String[] args) {

        RepositorioSolicitante repo = new RepositorioSolicitante();
        RepositorioMotorista repoM = new RepositorioMotorista();
        
        Gerente g1 = new Gerente(0, "658.788.334-68", "Duda", "12345", "duda@email.com", "F");
        System.out.println(g1);
        
        Date data = new Date("08/09/1997");
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);

        Motorista motorista = new Motorista(0, "100.299.814-06", "Andre", "12345", "andre@email.com", "M");
        Motorista motorista2 = new Motorista(1, "100.299.814-06", "Renan", "12345", "renan@email.com", "M");

        repo.adicionar(euzinha);
        g1.cadastrarMotorista(motorista, repoM);
        g1.cadastrarMotorista(motorista2, repoM);
        g1.listarClientes(repo);
        g1.removerMotorista(0, repoM);
        g1.listarMotoristas(repoM);
    }
}
