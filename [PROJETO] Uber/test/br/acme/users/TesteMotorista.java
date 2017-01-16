package br.acme.users;

import br.acme.location.Lugar;
import java.util.Date;

public class TesteMotorista {
    public static void main(String[] args) {
        
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andre", "12345", "andre@email.com", "M");
        Date data = new Date("08/09/1997");
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);
        Lugar origem = new Lugar("Casa", "Rua Tal");
        Lugar destino = new Lugar("Poli", "Rua da Poli");
        
        System.out.println(motorista);                                       
        motorista.responderPedidos(1, euzinha, origem, destino, "Dinheiro");
        motorista.historico();

        
    }
}
