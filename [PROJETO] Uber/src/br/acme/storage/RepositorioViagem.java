package br.acme.storage;

import br.acme.location.*;

public class RepositorioViagem {

    private final Viagem[] viagens;
    private int qtdViagem;

    public RepositorioViagem() {
        this.viagens = new Viagem[20];
        this.qtdViagem = 0;
    }

    public void adicionar(Viagem viagem) {
        if (viagem != null) {
            if (idValido(viagem.getId()) == true) {
                if (this.qtdViagem < this.viagens.length) {
                    this.viagens[qtdViagem] = viagem;
                    qtdViagem++;
                } else {
                    System.out.println("Sistema Lotado");
                }
            } else {
                System.out.println("Já existe viagem com esse id!");
            }
        }
    }

    public void remover(long id) {
        //Aqui remove pelo id
        for (int i = 0; i < qtdViagem; i++) {
            if (viagens[i].getId() == id) {
                viagens[i] = null;
                qtdViagem--;
                System.out.println("Viagem removido(a)");
            }
        }
        // Aqui passa o valor do prox p o anterior
        for (int i = (int) id; i < qtdViagem; i++) {
            if (i < qtdViagem) {
                viagens[i] = viagens[i + 1];
                viagens[i + 1] = null;
            } else {
                viagens[i + 1] = null;
            }
        }
    }

    public Viagem buscar(long id) {
        //Retorna uma Viagem , desde que esteja armazenado, dado seu identificador.
        for (int i = 0; i < qtdViagem; i++) {
            if (viagens[i].getId() == id) {
                return viagens[i];
            }
        }
        return null;
    }

    public void buscarTodos() {
        //Retorno a lista de todos as Viagens armazenadas.
        System.out.println("Viagens:");
        for (int i = 0; i < qtdViagem; i++) {
            if (viagens[i] != null) {
                System.out.println(viagens[i]);
            }
        }
    }

    public boolean idValido(long id) {
        boolean valido = true;
        for (int i = 0; i < viagens.length; i++) {
            if (viagens[i] != null) {
                if (id == viagens[i].getId()) {
                    valido = false;
                }
            }
        }
        return valido;
    }

}
