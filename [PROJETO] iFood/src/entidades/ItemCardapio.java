package entidades;

public class ItemCardapio {

// ------------- ATRIBUTOS --------------
    public long id;
    public String nome;
    public double preco;

// ------------- CONSTRUTOR --------------
    public ItemCardapio(String nome, long id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

// ------------- MÉTODOS --------------   
    @Override
    public String toString() {
        return getId() + "/" + getNome() + "/" + getPreco();
    }
   

// ------------- GET & SET --------------
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
