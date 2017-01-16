package br.acme.storage;

import br.acme.users.*;

public class RepositorioSolicitante {

    private final Solicitante[] solicitantes;
    private int qtdSolicitante;

    public RepositorioSolicitante() {
        this.solicitantes = new Solicitante[20];
        this.qtdSolicitante = 0;
    }

    public void adicionar(Solicitante solicitante) {
        if (solicitante != null) {
            if (idValido(solicitante.getId()) == true) {
                if (this.qtdSolicitante < this.solicitantes.length) {
                    this.solicitantes[qtdSolicitante] = solicitante;
                    qtdSolicitante++;
                    System.out.println(solicitante.getNome() + " adicionado(a)");
                } else {
                    System.out.println("Sistema Lotado");
                }
            } else {
                System.out.println("Esse id já está ocupado!");
            }
        }
    }

    public void remover(long id) {
        //Aqui remove pelo id.
        for (int i = 0; i < qtdSolicitante; i++) {
            if (solicitantes[i].getId() == id) {
                solicitantes[i] = null;
                qtdSolicitante--;
                System.out.println("Solicitante removido(a)");
            }
        }
        // Aqui reorganiza a fila.
        for (int i = (int) id; i < qtdSolicitante; i++) {
            if (i < qtdSolicitante) {
                solicitantes[i] = solicitantes[i + 1];
                solicitantes[i + 1] = null;
            } else {
                solicitantes[i + 1] = null;
            }
        }
    }

    public void alterar(long id, Solicitante solicitante) {
        //Altera as informações de um solicitante presente na lista
        //Além disso, deve informar se houve ou não a alteração.
        if (solicitante != null) {
            for (int i = 0; i < qtdSolicitante; i++) {
                if (solicitantes[i].getId() == id) {
                    solicitantes[i] = solicitante;
                    System.out.println("Alterado!");
                    break;
                } else {
                    System.out.println("Não alterado!");
                    break;
                }
            }
        }
    }

    public Solicitante buscar(long id) {
        //Retorna um Solicitante, desde que esteja armazenado, dado seu identificador.
        for (int i = 0; i < qtdSolicitante; i++) {
            if (solicitantes[i].getId() == id) {
                return solicitantes[i];
            }
        }
        return null;
    }

    public void buscarTodos() {
        //Retorna a lista de todos  os Solicitantes armazenados.
        System.out.println("Solicitantes:");
        for (int i = 0; i < qtdSolicitante; i++) {
            if (solicitantes[i] != null) {
                System.out.println(solicitantes[i].getNome());
            }
        }
    }

    public boolean idValido(long id) {
        boolean valido = true;
        for (int i = 0; i < solicitantes.length; i++) {
            if (solicitantes[i] != null) {
                if (id == solicitantes[i].getId()) {
                    valido = false;
                }
            }
        }
        return valido;
    }

}
