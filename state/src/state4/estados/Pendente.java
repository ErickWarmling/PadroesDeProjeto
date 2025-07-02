package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class Pendente extends PedidoEstado {

    public Pendente(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new Cancelado(pedido));
    }

    @Override
    public void retomar() throws Exception {
        pedido.setEstado(new EmAnalise(pedido));
    }

    @Override
    public String toString() {
        return "Pedido pendente";
    }
}