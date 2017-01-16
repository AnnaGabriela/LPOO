package repositorios;

import entidades.Pedido;
import entidades.Status;
import interfaces.RepPedidoInterface;

public class RepositorioPedido implements RepPedidoInterface{

// ------------- ATRIBUTOS --------------
    private final Pedido[] pedidos;
    public static int qtdPedido;
    private long proximoID;
    int numMaxPedidos = 0;

// ------------- CONSTRUTOR  --------------
    public RepositorioPedido() {
        this.pedidos = new Pedido[numMaxPedidos];
        qtdPedido = 0;
        this.proximoID = 0;
    }

// ------------- MÉTODOS --------------
    public void adicionar(Pedido pedido) {
        if (this.qtdPedido < this.pedidos.length) {
            if (!contains(pedido)) {
                pedido.setIdPedido(proximoID);
                this.pedidos[qtdPedido] = pedido;
                qtdPedido++;
                this.proximoID++;
                System.out.println(pedidos[qtdPedido].getIdPedido() + " adicionado");
            }
        }
    }

    public void adicionarFixo(Pedido pedido) {
        if (pedido != null) {
            if (this.qtdPedido < this.pedidos.length) {
                if (!contains(pedido)) {
                    this.pedidos[qtdPedido] = pedido;
                    qtdPedido++;
                    System.out.println(pedidos[qtdPedido].getIdPedido() + " adicionado");
                }
            }
        }
    }

    public void remover(int id) {
        for (int i = 0; i < qtdPedido; i++) {
            if (pedidos[i].getIdPedido() == id) {
                pedidos[i] = null;
                pedidos[i] = pedidos[qtdPedido - 1];
                pedidos[qtdPedido - 1] = null;
                qtdPedido--;
                System.out.println("Pedido removido");
            }
        }
    }

    public boolean contains(Pedido pedido) {
        for (int i = 0; i < qtdPedido; i++) {
            if (pedidos[i].getIdPedido() == pedido.getIdPedido()) {
                return true;
            }
        }
        return false;
    }

    public void verificarStatus(Status statusPedido) {
        if (statusPedido == Status.Enviado) {
            System.out.println("Enviado");
        } else {
            System.out.println("Pedido Pendente");
        }
    }

    public Pedido[] getPedido() {
        return pedidos;
    }

    public Pedido[] getPedidoCopia() {
        return pedidos.clone();
    }

    public long getProximoID() {
        return proximoID;
    }

    public void setProximoID(long proximoID) {
        this.proximoID = proximoID;
    }

    public static int getQtdPedido() {
        return qtdPedido;
    }

   

}
