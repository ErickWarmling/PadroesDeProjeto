package state4.pedido;

public class PedidoAtendido extends PedidoEstado {

    public PedidoAtendido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String toString() {
        return "Pedido Atendido";
    }
}