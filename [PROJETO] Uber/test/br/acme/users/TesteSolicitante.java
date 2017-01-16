package br.acme.users;

import br.acme.location.Lugar;
import br.acme.storage.*;
import java.util.Date;

public class TesteSolicitante {

    public static void main(String[] args) {

        RepositorioSolicitante repo = new RepositorioSolicitante();
        RepositorioMotorista repoM = new RepositorioMotorista();
        
        Date data = new Date("08/09/1997");
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);
        Solicitante euzinha2 = new Solicitante(1, "100.277.814-02", "Duda", "090897", "duda@email.com", "F", data, 982493624);
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andre", "12345", "andre@email.com", "M");
        Motorista motorista2 = new Motorista(1, "100.299.814-06", "Renan", "12345", "renan@email.com", "M");
        Lugar origem = new Lugar("Casa", "Rua Tal");
        Lugar destino = new Lugar("Poli", "Rua da Poli");

        repo.adicionar(euzinha);
        repo.adicionar(euzinha2);
        repoM.adicionar(motorista);
        repoM.adicionar(motorista2);
        
        System.out.println("");
        
        euzinha.solicitarCarona(repoM, origem, destino, "Dinheiro");
        euzinha2.solicitarCarona(repoM, origem, destino, "Cartão");
        euzinha.historico();
        euzinha.cancelarCarona(0);
        System.out.println(euzinha);
    }
}
