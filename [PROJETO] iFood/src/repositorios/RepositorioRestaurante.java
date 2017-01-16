package repositorios;

import dados.Database;
import entidades.ItemCardapio;
import entidades.Restaurante;
import interfaces.RepRestauranteInterface;

public class RepositorioRestaurante implements RepRestauranteInterface {

    private Restaurante[] restaurantes;
    private long proximoID;
    private int qtdRestaurante;
    private ItemCardapio[] cardapio;

// ------------- CONSTRUTOR --------------
    public RepositorioRestaurante() {
        this.restaurantes = new Restaurante[150];
        this.qtdRestaurante = 0;
        this.proximoID = 1;
    }

// ------------- MÉTODOS --------------
    public void adicionarRestaurante(Restaurante restaurante) {
        if (restaurante != null) {
            if (this.qtdRestaurante < this.restaurantes.length && !contains(restaurante)) {
                restaurante.setId(proximoID);
                this.restaurantes[qtdRestaurante] = restaurante;
                qtdRestaurante++;
                this.proximoID++;
                System.out.println(restaurante.nome + " foi adicionado");
            }
        }
    }

    public void adicionarRestauranteFixo(Restaurante restaurante) {
        if (restaurante != null) {
            if (this.qtdRestaurante < this.restaurantes.length && !contains(restaurante)) {
                this.restaurantes[qtdRestaurante] = restaurante;
                qtdRestaurante++;
                System.out.println(restaurante.nome + " foi adicionado");
            }
        }
    }

    public void removerRestaurante(int id) {
        for (int i = 0; i < qtdRestaurante; i++) {
            if (restaurantes[i].getId() == id) {
                restaurantes[i] = null;
                restaurantes[i] = restaurantes[qtdRestaurante - 1];
                restaurantes[qtdRestaurante - 1] = null;
                qtdRestaurante--;
                System.out.println("Cliente removido");
                Database.SalvarEstado(this);
            }
        }
    }

    public void listarRestaurantes() {
        System.out.println("Restaurantes: ");
        for (Restaurante restaurante : restaurantes) {
            if (restaurante != null) {
                System.out.println(restaurante.id + " - " + restaurante.nome);
            }
        }
    }

    public void adicionarPrato(int idRestaurante, ItemCardapio item) {
        restaurantes[idRestaurante].adicionarPrato(item);
        Database.SalvarEstado(this);
    }

    public void removerPrato(int idRestaurante, int idPrato) {
        restaurantes[idRestaurante].removerPrato(idPrato);
        Database.SalvarEstado(this);
    }

    @Override
    public String toString() {
        String r = "";
        for (Restaurante restaurante : restaurantes) {
            if (restaurante != null) {
                r += restaurante.id + " - " + restaurante.nome + "\n";
            }
        }
        return r;
    }

    public String listarCardapio(long id) {
        String s = "";
        int idR = (int) id;
        Restaurante rest = buscar(idR);
        for (int i = 0; i < rest.cardapio.length; i++) {
            if (rest.cardapio[i] != null) {
                s += rest.cardapio[i].id + " - " + rest.cardapio[i].nome + " - R$" + rest.cardapio[i].preco + "\n";
            }
        }
        return s;
    }

    public void alterarSenha(int id, String novaSenha) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getId() == id) {
                restaurantes[id].setSenha(novaSenha);
                System.out.println("Senha alterada");
            }
        }
    }

    public void alterarNome(int id, String novoNome) {
        for (int i = 0; i < restaurantes.length; i++) {
            if (restaurantes[i].getId() == id) {
                restaurantes[id].setSenha(novoNome);
                System.out.println("Nome alterado");
            }
        }
    }

    public boolean contains(Restaurante restaurante) {
        for (int i = 0; i < qtdRestaurante; i++) {
            if (restaurantes[i].getId() == restaurante.getId()) {
                return true;
            }
        }
        return false;
    }

    public void logout(String login, String senha) {
        for (int i = 0; i < qtdRestaurante; i++) {
            restaurantes[i].setLogin(null);
            restaurantes[i].setSenha(null);
        }

    }

    public boolean verificarRest(String login, String senha) {
        for (int i = 0; i < qtdRestaurante; i++) {
            if (restaurantes[i].getLogin().equals(login) && restaurantes[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Restaurante buscar(long idRest) {
        for (int i = 0; i < qtdRestaurante; i++) {
            if (restaurantes[i].getId() == idRest) {
                return restaurantes[i];
            }
        }
        return null;
    }

    public long buscarPeloLogin(String login) {
        for (int i = 0; i < qtdRestaurante; i++) {
            if (restaurantes[i].getLogin().equals(login)) {
                return restaurantes[i].id;
            }
        }
        return 0;
    }
    
    public ItemCardapio buscarItemPeloId (long idItem) {
        for (int i = 0; i < cardapio.length; i++) {
            if (cardapio[i].id == idItem)
                return cardapio[i];
        } return null;
    }

    public void validar() {
    }

    public int getQtdRestaurante() {
        return qtdRestaurante;
    }

    public long getProximoID() {
        return proximoID;
    }

    public void setProximoID(long proximoID) {
        this.proximoID = proximoID;
    }

    public Restaurante[] getRestaurantes() {
        return restaurantes;
    }

    public Restaurante[] getRestaurantesCopia() {
        return restaurantes.clone();
    }

    public ItemCardapio[] getCardapio() {
        return cardapio;
    }

    public void setCardapio(ItemCardapio[] cardapio) {
        this.cardapio = cardapio;
    }

}
