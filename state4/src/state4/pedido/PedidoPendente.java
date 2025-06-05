package state4.pedido;

public class PedidoPendente extends PedidoEstado{

    public PedidoPendente(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void retomar() throws Exception {
        pedido.setEstado(new PedidoEmAnalise(pedido));
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new PedidoCancelado(pedido));
    }

    @Override
    public String toString() {
        return "Pedido Pendente";
    }
}
