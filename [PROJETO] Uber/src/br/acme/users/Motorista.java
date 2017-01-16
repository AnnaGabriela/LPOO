package br.acme.users;

import br.acme.location.*;

public class Motorista extends Usuario {

    private boolean disponivel;
    private Viagem[] viagens;

    public Motorista(long id, String cpf, String nome, String senha, String email, String sexo) {
        super(id, cpf, nome, senha, email, sexo);
        this.disponivel = true;
        this.viagens = new Viagem[20];
    }

    public void responderPedidos(long id, Solicitante cliente, Lugar origem, Lugar destino, String formaPagamento) {
        //Nesse método o Motorista informa se pode fazer ou não a viagem.
        //Caso sim, é necessário criar um objeto Viagem.
        Viagem viagem = new Viagem(id, cliente, this, origem, destino, formaPagamento);
        System.out.println("Pedido realizado! " + this.getNome() + " aceitou seu pedido.");
        for (int i = 0; i < 20; i++) {
            viagens[i] = viagem;
            break;
        }
    }

    public void historico() {
        //Lista todas as viagens do motorista.
        for (Viagem viagem : viagens) {
            if (viagem != null) {
                System.out.println(viagem);
            }
        }
    }

    @Override
    public String toString() {
        String dados = super.toString() + "; "
                + "Disponibilidade: " + this.disponivel + ";";
        dados += "Viagens: ";
        for (int i = 0; i < 20; i++) {
            if (viagens[i] != null) {
                dados += viagens[i];
            }
        }
        return dados;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Viagem[] getViagens() {
        return viagens;
    }

    public void setViagens(Viagem[] viagens) {
        this.viagens = viagens;
    }

}
