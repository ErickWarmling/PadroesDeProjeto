package state4.pedido;

public class PedidoEmAnalise extends PedidoEstado{

    public PedidoEmAnalise(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void suspender() throws Exception {
        pedido.setEstado(new PedidoPendente(pedido));
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new PedidoCancelado(pedido));
    }

    @Override
    public void aprovar() throws Exception {
        pedido.setEstado(new PedidoAprovado(pedido));
    }

    @Override
    public String toString() {
        return "Pedido Em Analise";
    }
}
