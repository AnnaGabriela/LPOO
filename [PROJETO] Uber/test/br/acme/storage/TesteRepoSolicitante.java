package br.acme.storage;

import br.acme.location.Lugar;
import br.acme.users.*;
import java.util.Date;

public class TesteRepoSolicitante {

    public static void main(String[] args) {

        Date data = new Date("08/09/1997");
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);
        Solicitante euzinha2 = new Solicitante(1, "100.277.814-02", "Duda", "090897", "duda@email.com", "F", data, 982493624);
        RepositorioSolicitante repo = new RepositorioSolicitante();
        RepositorioMotorista repoM = new RepositorioMotorista();
        RepositorioViagem repoV = new RepositorioViagem();
        
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andre", "12345", "andre@email.com", "M");
        Motorista motorista2 = new Motorista(1, "100.299.814-06", "Renan", "12345", "renan@email.com", "M");
        
        Lugar origem = new Lugar("Casa", "Rua Tal");
        Lugar destino = new Lugar("Poli", "Rua da Poli");
        
        // ADICIONAR MOTORISTA
        repoM.adicionar(motorista);
        repoM.adicionar(motorista2);
       
        // ADICIONAR SOLICITANTES
        repo.adicionar(euzinha);
        repo.adicionar(euzinha2);

        // BUSCAR
        System.out.println("\n");
        System.out.println(repo.buscar(0));

        // BUSCAR TODOS
        System.out.println("\n");
        repo.buscarTodos();

        // ALTERAR 
        System.out.println("\n");
        Date data2 = new Date("09/19/1968");
        Solicitante euzinhaNovo = new Solicitante(0, "650-877-334-72", "Ana Paula", "1234", "aninhagabs@email.com", "F", data2, 988987654);
        repo.alterar(0, euzinhaNovo);

        // BUSCAR TODOS *teste depois de alterar*
        System.out.println("\n");
        repo.buscarTodos();

        // REMOVER
        System.out.println("\n");
        repo.remover(0);

        // BUSCAR TODOS *teste depois de remover*
        System.out.println("\n");
        repo.buscarTodos();
        System.out.println("");
        
    }
}
