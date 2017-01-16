package br.acme.location;

import br.acme.users.*;

public class Viagem {

    private long id;
    private Solicitante cliente;
    private Motorista motorista;
    private Lugar origem;
    private Lugar destino;
    private double valorViagem;
    private String formaPagamento;

    public Viagem(long id, Solicitante cliente, Motorista motorista, Lugar origem, Lugar destino, String formaPagamento) {
        this.id = id;
        this.cliente = cliente;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        String dados = "ID: " + getId() + ";"
                + "Cliente: " + getCliente().getNome() + ";"
                + "Motorista: " + getMotorista().getNome() + ";"
                + "Origem: " + getOrigem().getIdentificadorLugar() + ";"
                + "Destino: " + getDestino().getIdentificadorLugar() + ";"
                + "Valor da viagem: " + getValorViagem() + ";"
                + "Forma de Pagamento: " + getFormaPagamento() + ";";
        return dados;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Solicitante getCliente() {
        return cliente;
    }

    public void setCliente(Solicitante cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Lugar getOrigem() {
        return origem;
    }

    public void setOrigem(Lugar origem) {
        this.origem = origem;
    }

    public Lugar getDestino() {
        return destino;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
