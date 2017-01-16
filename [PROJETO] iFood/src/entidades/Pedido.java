package entidades;

import repositorios.RepositorioPedido;

public class Pedido {

// ------------- ATRIBUTOS --------------
    private RepositorioPedido pedidos;
    private ItemCardapio[] itens;
    private long idRestaurante;
    private long idCliente;
    private long idPedido;
    Status status;
    
// -------------- CONSTRUTOR ---------------
    public Pedido(long idRestaurante, long idCliente, long idPedido) {
        this.idCliente = idCliente;
        this.status = Status.Default;
    }


// -------------- MÉTODOS ---------------
    public void verificarStatus(Status statusPedido) {
        pedidos.verificarStatus(statusPedido);
    }

    public void adicionar(Pedido pedido) {
        pedidos.adicionar(pedido);
    }
    
    public void remover (int id) {
        pedidos.remover(id);
    }
    
    @Override
        public String toString() {
        String s = idPedido + ";" + idCliente + ";" + idRestaurante + ";" + status;
            for (int i = 0; i < RepositorioPedido.qtdPedido ; i++) {
            s += itens[i].nome + ";";
        }
        return s;
    }
        
// ------------- GET & SET --------------
    public ItemCardapio[] getItens() {
        return itens;
    }

    public void setItens(ItemCardapio[] itens) {
        this.itens = itens;
    }
    
    public void setItem (ItemCardapio item) {
        for (int i=0; i<itens.length; i++) {
            this.itens[i] = item;
        }
    }
    
    public long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

}
