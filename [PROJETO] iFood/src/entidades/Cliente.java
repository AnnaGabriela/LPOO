package entidades;

import excecoes.IdException;
import excecoes.SenhaException;
import javax.swing.JOptionPane;

public class Cliente extends Usuario {

// ------------- ATRIBUTOS --------------
    private long[] favoritos;
    public static int MAX_ITEM_CARRINHO = 150;
    private ItemCardapio[] carrinho;
    private String stringPedido;

// ------------- CONSTRUTOR --------------
    public Cliente(String login, String senha, String nome, long id) {
        super(login, senha, nome, id);
        this.carrinho = new ItemCardapio[MAX_ITEM_CARRINHO];
    }

// --------------- MÉTODOS ----------------
    public void adicionarNoCarrinho(ItemCardapio item) {
        for (int i = 0; i < MAX_ITEM_CARRINHO; i++) {
            if (carrinho[i] == null) {
                carrinho[i] = item;
                System.out.println(item.nome + " adicionado no carrinho.");
                break;
            } else if (i == (MAX_ITEM_CARRINHO - 1)) {
                System.out.println("Carrinho cheio");
                break;
            }
        }
    }

    public void removerDoCarrinho(int id) {
        if (carrinho[id] != null) {
            carrinho[id] = null;
            System.out.println("Item " + id + " removido do carrinho");
        } else {
            System.out.println("Carrinho vazio");
        }
    }

    public void efetuarPedido() {
        stringPedido = String.valueOf(Cliente.this.getId()) + ";";
        stringPedido += "50;";
        stringPedido += "ENVIADO;";
        for (int i = 0; i < MAX_ITEM_CARRINHO; i++) {
            if (carrinho[i] != null) {
                stringPedido += carrinho[i].getId() + "/";
                stringPedido += carrinho[i].getNome() + "/";
                stringPedido += carrinho[i].getPreco() + ";";
            }
        }
    }

    public void cancelarPedido() {
    }

    public void mostrarFavoritos() {
    }

    @Override
    public void validar() throws IdException, SenhaException {
        if (this.id < 0) {
            throw new IdException("Id inválido!");
        } else if (this.senha.length() < 6 || this.senha.length() > 10) {
            throw new SenhaException("Senha deve ter no mínimo 6 e no máximo 10 caracteres");
        }
    }

    @Override
    public String toString() {
        return id + ";" + login + ";" + senha + ";" + nome;
    }

    public String listarCarrinho() {
        String s = "";
        for (int i = 0; i <carrinho.length; i++) {
            if (carrinho[i] != null) {
                s += carrinho[i].id + " - " + carrinho[i].nome + " - R$" + carrinho[i].preco + "\n";
            }
        }
        return s;
    }
// --------------- GET & SET ----------------

    public long[] getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(long[] favoritos) {
        this.favoritos = favoritos;
    }

    public ItemCardapio[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ItemCardapio[] carrinho) {
        this.carrinho = carrinho;
    }

}
