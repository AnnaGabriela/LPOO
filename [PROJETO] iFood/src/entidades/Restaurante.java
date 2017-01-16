package entidades;

import excecoes.IdException;
import excecoes.SenhaException;
import java.util.Arrays;

public class Restaurante extends Usuario {

// ------------- ATRIBUTOS --------------
    private Pedido[] pedidosEspera;
    private final int MAX_PRATOS = 150;
    public ItemCardapio[] cardapio;
    private long proximoPratoId;
    private int qtdCardapio;
// ------------- CONSTRUTOR --------------

    public Restaurante(String login, String senha, String nome, long id) {
        super(login, senha, nome, id);
        this.cardapio = new ItemCardapio[MAX_PRATOS];
        this.pedidosEspera = pedidosEspera;
        this.proximoPratoId = 1;
        this.qtdCardapio = 0;
    }

// ------------- MÉTODOS --------------
    public void adicionarPrato(ItemCardapio item) {
        if (qtdCardapio >= MAX_PRATOS) {
            System.out.println("Nao há espaco no cardapio!");
        } else {
            item.setId(proximoPratoId);
            cardapio[qtdCardapio] = item;
            proximoPratoId++;
            qtdCardapio++;
        }
    }

    public void adicionarPratoFixo(ItemCardapio item) {
        if (qtdCardapio >= MAX_PRATOS) {
            System.out.println("Nao há espaco no cardapio!");
        } else {
            cardapio[qtdCardapio] = item;
            qtdCardapio++;

        }
    }

    public void removerPrato(int id) {
        for (int i = 0; i < qtdCardapio; i++) {
            if (cardapio[i].id != 0) {
                cardapio[i] = cardapio[qtdCardapio - 1];
                cardapio[qtdCardapio - 1] = null;
                qtdCardapio--;
            }
        }
    }

    public void listarPedidos() {
        if (pedidosEspera != null) {
            for (int i = 0; i <= pedidosEspera.length; i++) {
                System.out.println(i + 1 + " Pedido(s) em espera: " + Arrays.toString(pedidosEspera));
            }
        } else {
            System.out.println("Nenhum pedido!");
        }
    }

    private boolean contains(ItemCardapio item) {
        for (int i = 0; i < qtdCardapio; i++) {
            if (cardapio[i].getId() == item.getId()) {
                return true;
            }
        }
        return false;
    }

    public void cancelarPedido() {
    }

    public void confirmarEnvio() {
    }

    public String listarItens() {
        String i = "";
        for (ItemCardapio cardapio1 : this.cardapio) {
            i += cardapio1.id + " - " + cardapio1.nome + "\n";
        }
        return i;
    }

    public ItemCardapio buscarItem(long id) {
        for (int i = 0; i < qtdCardapio; i++) {
            if (cardapio[i].getId() == id) {
                return cardapio[i];
            }
        }
        return null;
    }

    public boolean LetrasENumerosExistem() {
        char[] c = senha.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!Character.isDigit(c[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean LetrasENumerosApenas() {
        return senha.matches("[a-zA-Z0-9]+");
    }

    @Override
    public void validar() throws IdException, SenhaException {
        if (this.id < 0) {
            throw new IdException();
        } else if (this.senha.length() < 10 || this.senha.length() > 18) {
            throw new SenhaException("Senha deve ter no min 10 e no max 18 caracteres");
        } else if (!LetrasENumerosExistem()) {
            throw new SenhaException("Senha deve ter pelo menos uma letra e um numero");
        } else if (!LetrasENumerosApenas()) {
            throw new SenhaException("Senha deve ter apenas num e letras");
        }
    }

    public String toString() {
        String s = getId() + ";" + getLogin() + ";" + getSenha() + ";" + getNome() + ";" + getProximoPratoId();
        for (int i = 0; i < qtdCardapio; i++) {
            s += ";" + cardapio[i];
        }
        return s;
    }

    public String excel() {
        return getId() + ";" + getLogin() + ";" + getSenha() + ";" + getNome() + ";" + getProximoPratoId();
    }
// ------------- GET & SET --------------    

    public Pedido[] getPedidosEspera() {
        return pedidosEspera;
    }

    public void setPedidosEspera(Pedido[] pedidosEspera) {
        this.pedidosEspera = pedidosEspera;
    }

    public ItemCardapio[] getCardapio() {
        return cardapio;
    }

    public void setCardapio(ItemCardapio[] cardapio) {
        this.cardapio = cardapio;
    }

    public void setItemCardapio(ItemCardapio item) {
        for (int i = 0; i < cardapio.length; i++) {
            this.cardapio[i] = item;
        }
    }

    public long getProximoPratoId() {
        return proximoPratoId;
    }

    public void setProximoPratoId(long proximoPratoId) {
        this.proximoPratoId = proximoPratoId;
    }

    public void listarCardapio(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
