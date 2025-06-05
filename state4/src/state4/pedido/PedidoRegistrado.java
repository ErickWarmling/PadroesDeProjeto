package state4.pedido;

public class PedidoRegistrado extends PedidoEstado{

    public PedidoRegistrado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado(new PedidoEmAnalise(pedido));
    }

    @Override
    public String toString() {
        return "Pedido Registrado";
    }
}
