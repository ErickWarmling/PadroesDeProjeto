package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class Aprovado extends PedidoEstado {

    public Aprovado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void atender() throws Exception {
        pedido.setEstado(new Atendido(pedido));
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new Cancelado(pedido));
    }

    @Override
    public String toString() {
        return "Pedido aprovado";
    }
}