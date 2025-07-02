package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class Atendido extends PedidoEstado {

    public Atendido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String toString() {
        return "Pedido atendido";
    }
}