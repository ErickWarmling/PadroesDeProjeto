package state4.pedido;

public class PedidoAprovado extends PedidoEstado{

    public PedidoAprovado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new PedidoCancelado(pedido));
    }

    @Override
    public void atender() throws Exception {
        pedido.setEstado(new PedidoAtendido(pedido));
    }

    @Override
    public String toString() {
        return "Pedido Aprovado";
    }
}
