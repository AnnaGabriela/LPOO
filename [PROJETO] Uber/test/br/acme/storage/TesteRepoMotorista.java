package br.acme.storage;

import br.acme.users.Motorista;

public class TesteRepoMotorista {
    public static void main(String[] args) {
        
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andre", "12345", "andre@email.com", "M");
        Motorista motorista2 = new Motorista(1, "100.299.814-06", "Renan", "12345", "renan@email.com", "M");
        RepositorioMotorista repo = new RepositorioMotorista();
    
        // ADICIONAR
        repo.adicionar(motorista);
        repo.adicionar(motorista2);
        
        // BUSCAR
        System.out.println("\n");
        System.out.println(repo.buscar(0));
        
        // BUSCAR TODOS
        System.out.println("\n");
        repo.buscarTodos();
        
        // ALTERAR
        System.out.println("\n");
        Motorista motorista3 = new Motorista(0, "100.299.814-06", "Victor", "neymar123", "cr7@hotmail.com", "M");
        repo.alterar(0, motorista3);
        
        // BUSCAR TODOS *teste depois de alterar*
        System.out.println("\n");
        repo.buscarTodos();

        // REMOVER
        System.out.println("\n");
        repo.remover(0);
        
        // BUSCAR TODOS *teste depois de remover*
        System.out.println("\n");
        repo.buscarTodos();
        
    }
}
