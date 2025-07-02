package state4.pedido;

public class PedidoCancelado extends PedidoEstado{

    public PedidoCancelado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String toString() {
        return "Pedido Cancelado";
    }
}
