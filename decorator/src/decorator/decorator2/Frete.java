package decorator.decorator2;

public class Frete extends PedidoDecorator {

    private int tipoFrete; // 0 - Correio | 1 - Transportadora

    public Frete(PedidoBase pedido, int tipoFrete) {
        super(pedido);
        this.tipoFrete = tipoFrete;
    }

    @Override
    public void concluir() {
        super.concluir();
        System.out.println((tipoFrete == 0 ? "Correio" : "Transportadora"));
    }

    @Override
    public double getTotal() {
        return super.getTotal() + (tipoFrete == 0 ? 40 : 30);
    }
}
