package br.acme.storage;

import br.acme.location.*;
import br.acme.users.*;
import java.util.Date;

public class TesteRepoViagem {

    public static void main(String[] args) {

        Date data = new Date("08/09/1997");
        RepositorioViagem repo = new RepositorioViagem();

        // VIAGEM 1 //
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andreoni", "12345", "moto@email.com", "M");
        Lugar origem = new Lugar("Casa", "Rua F Ambrosio Barros Leite, 152");
        Lugar destino = new Lugar("Poli", "Rua Benfica");
        Viagem viagem = new Viagem(0, euzinha, motorista, origem, destino, "Dinheiro");

        // VIAGEM 2 //
        Solicitante euzinha2 = new Solicitante(1, "123.456.079-12", "Eduarda", "12345", "dudaottoni@hotmail.com", "F", data, 982345674);
        Motorista motorista2 = new Motorista(1, "200.931..987-09", "Renan", "01234", "moto@email.com", "M");
        Lugar origem2 = new Lugar("Casa", "Rua Vigário Barreto, 127");
        Lugar destino2 = new Lugar("Riomar", "Rua do riomar");
        Viagem viagem2 = new Viagem(1, euzinha2, motorista2, origem2, destino2, "Débito");

        // ADICIONAR
        repo.adicionar(viagem);
        repo.adicionar(viagem2);

        // BUSCAR
        System.out.println("\n" + repo.buscar(0));

        // BUSCAR TODOS
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
