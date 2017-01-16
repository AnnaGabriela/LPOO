package br.acme.users;

import br.acme.location.*;
import br.acme.storage.RepositorioMotorista;
import br.acme.storage.RepositorioViagem;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solicitante extends Usuario {

    private Date dataNascimento;
    private String dataFormatada;
    private int numeroCelular;
    private Lugar[] lugares;
    private final Viagem[] viagens;

    RepositorioViagem repoV = new RepositorioViagem();
    
    public Solicitante(long id, String cpf, String nome, String senha, String email, String sexo, Date dataNascimento, int numeroCelular) {
        super(id, cpf, nome, senha, email, sexo);
        this.dataNascimento = dataNascimento;
        this.numeroCelular = numeroCelular;
        this.lugares = new Lugar[20];
        this.viagens = new Viagem[20];
    }

    public void solicitarCarona(RepositorioMotorista repoM, Lugar origem, Lugar destino, String formaDePagamento) {
        //Esse método deve enviar uma requisição para o Motorista disponível na vez.
        Motorista motoristaDisponivel = repoM.buscarDisponivel();
        motoristaDisponivel.responderPedidos(this.getId(), this, origem, destino, formaDePagamento);
        Viagem viagem = new Viagem(0, this, motoristaDisponivel, origem, destino, formaDePagamento);
        repoV.adicionar(viagem);
    }

    public void cancelarCarona(long idViagem) {
        //Esse método deve cancelar uma requisição de carona. Se o cancelamento ocorrer
        //após um definido período de tempo, o Cliente deve pagar um valor padrão.
        repoV.remover(idViagem);
    }

    public void historico() {
        //Lista todas as viagens do usuário.
        for (Viagem viagem : viagens) {
            if (viagem != null) {
                System.out.println(viagem);
            }
        }
    }

    public String getDataFormatada() {
        dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento);
        return dataFormatada;
    }

    @Override
    public String toString() {
        String dados = super.toString() + ";"
                + "Data  de Nascimento: " + this.getDataFormatada() + ";"
                + "Número do Celular: " + this.getNumeroCelular() + ";"
                + "Lugares: ";
        for (Lugar lugar : lugares) {
            if (lugar != null) {
                dados += lugar;
            }
        }
        dados += "Viagens: ";
        for (Viagem viagem : viagens) {
            if (viagem != null) {
                dados += viagem;
            }
        }
        return dados;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Lugar[] getLugares() {
        return lugares;
    }

    public void setLugares(Lugar[] lugares) {
        this.lugares = lugares;
    }

}
