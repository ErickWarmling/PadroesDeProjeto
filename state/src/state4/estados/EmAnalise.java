package state4.estados;

import state4.pedido.Pedido;
import state4.pedido.PedidoEstado;

public class EmAnalise extends PedidoEstado {

    public EmAnalise(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void aprovar() throws Exception {
        pedido.setEstado(new Aprovado(pedido));
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new Cancelado(pedido));
    }

    @Override
    public void suspender() throws Exception {
        pedido.setEstado(new Pendente(pedido));
    }

    @Override
    public String toString() {
        return "Pedido em análise";
    }
}