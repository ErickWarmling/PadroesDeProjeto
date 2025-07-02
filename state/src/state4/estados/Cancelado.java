package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class Cancelado extends PedidoEstado {

    public Cancelado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String toString() {
        return "Pedido cancelado";
    }
}