package decorator.decorator2;

public class Mensagem extends PedidoDecorator {

    private String numeroTelefone;

    public Mensagem(PedidoBase pedido, String numeroTelefone) {
        super(pedido);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void concluir() {
        super.concluir();
        System.out.println("Comunicando com o número " + numeroTelefone + " com preço " + getTotal());
    }
}