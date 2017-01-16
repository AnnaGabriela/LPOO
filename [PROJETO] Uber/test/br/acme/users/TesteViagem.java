package br.acme.users;

import br.acme.location.*;
import br.acme.storage.RepositorioViagem;
import java.util.Date;

public class TesteViagem {

    public static void main(String[] args) {

        Date data = new Date("08/09/1997");
        RepositorioViagem repo = new RepositorioViagem();

        // VIAGEM 1 //
        Solicitante euzinha = new Solicitante(0, "100.277.814-02", "Anna", "090897", "aninhagabs@email.com", "F", data, 982493624);
        Motorista motorista = new Motorista(0, "100.299.814-06", "Andreoni", "12345", "moto@email.com", "M");
        Lugar origem = new Lugar("Casa", "Rua F Ambrosio Barros Leite, 152");
        Lugar destino = new Lugar("Poli", "Rua Benfica");
        Viagem viagem = new Viagem(0, euzinha, motorista, origem, destino, "Dinheiro");

        System.out.println("Solicitante:\n" + viagem.getCliente().getNome()+"\n");       //DADOS DO CLIENTE
        System.out.println("Motorista:\n" + viagem.getMotorista().getNome()+"\n");      //DADOS DO MOTORISTA
        System.out.println("Origem:\n"+viagem.getOrigem().getEndereco()+"\n");          //ORIGEM
        System.out.println("Destino:\n"+viagem.getDestino().getEndereco()+"\n");        //DESTINO
        System.out.println("Forma de Pagamento:\n"+viagem.getFormaPagamento()+"\n");    //FORMA DE PAGAMENTO
        viagem.setValorViagem(34.5);                                                    // VALOR DA VIAGEM
        System.out.println("Valor da Viagem:\nR$ " + viagem.getValorViagem());

        

    }

}
