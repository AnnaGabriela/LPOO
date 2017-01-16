package interfaces;

import entidades.Pedido;
import entidades.Status;

public interface RepPedidoInterface {
    
     void adicionar(Pedido pedido);
     
     void adicionarFixo(Pedido pedido);
              
     void remover(int id);
     
     boolean contains(Pedido pedido);
     
     void verificarStatus(Status statusPedido);
     
}

