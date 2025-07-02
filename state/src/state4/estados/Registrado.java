package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class Registrado extends PedidoEstado {

    public Registrado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado(new EmAnalise(pedido));
    }

    @Override
    public String toString() {
        return "Pedido registrado";
    }
}