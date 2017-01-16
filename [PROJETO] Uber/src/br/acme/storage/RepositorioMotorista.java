package br.acme.storage;

import br.acme.users.*;

public class RepositorioMotorista {

    private final Motorista[] motoristas;
    private int qtdMotoristas;

    public RepositorioMotorista() {
        this.motoristas = new Motorista[20];
        this.qtdMotoristas = 0;
    }

    public void adicionar(Motorista motorista) {
        if (this.qtdMotoristas < this.motoristas.length) {
            this.motoristas[qtdMotoristas] = motorista;
            qtdMotoristas++;
            System.out.println(motorista.getNome() + " adicionado");
        } else {
            System.out.println("Sistema Lotado");
        }
    }

    public void remover(long id) {
        //Aqui remove pelo id
        for (int i = 0; i < qtdMotoristas; i++) {
            if (motoristas[i].getId() == id) {
                motoristas[i] = null;
                qtdMotoristas--;
                System.out.println("Motorista removido(a)");
            }
        }
        // Aqui passa o valor do prox p o anterior
        for (int i = (int) id; i < qtdMotoristas; i++) {
            if (i < qtdMotoristas) {
                motoristas[i] = motoristas[i + 1];
                motoristas[i + 1] = null;
            } else {
                motoristas[i + 1] = null;
            }
        }
    }

    public void alterar(long id, Motorista motorista) {
        //Altera as informações de um motorista presente na lista
        //Além disso, deve informar se houve ou não a alteração.
        if (motorista != null) {
            for (int i = 0; i < qtdMotoristas; i++) {
                if (motoristas[i].getId() == id) {
                    motoristas[i] = motorista;
                    System.out.println("Alterado!");
                    break;
                } else {
                    System.out.println("Não alterado!");
                    break;
                }
            }
        }
    }

    public Motorista buscar(long id) {
        //Retorna um Motorista, desde que esteja armazenado, dado seu identificador.
        for (int i = 0; i < qtdMotoristas; i++) {
            if (motoristas[i].getId() == id) {
                return motoristas[i];
            }
        }
        return null;
    }

    public void buscarTodos() {
        //Retorno a lista de todos os Motorista armazenados.
        System.out.println("Motoristas:");
        for (int i = 0; i < qtdMotoristas; i++) {
            if (motoristas[i] != null) {
                System.out.println(motoristas[i].getNome());
            }
        }
    }

    public Motorista buscarDisponivel() {
        for (int i = 0; i < qtdMotoristas; i++) {
            if (motoristas[i] != null) {
                if (motoristas[i].isDisponivel()) {
                    motoristas[i].setDisponivel(false);
                    return motoristas[i];
                }
            }
        }
        return null;
    }
}
