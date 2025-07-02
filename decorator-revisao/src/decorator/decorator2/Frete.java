package decorator.decorator2;

public class Frete extends  PedidoDecorator {

    private int tipoFrete; // 0 - Correio | 1 - Transportadora

    public Frete(PedidoBase pedido, int tipoFrete) {
        super(pedido);
        this.tipoFrete = tipoFrete;
    }

    @Override
    public void concluir() {
        super.concluir();
        if (tipoFrete == 0) {
            System.out.println("Comunicando com os Crreios");
        } else {
            System.out.println("Comunicando com a Transportadora");
        }
    }

    @Override
    public double getTotal() {
        return super.getTotal() + (tipoFrete == 0 ? 40 : 30);
    }
}
