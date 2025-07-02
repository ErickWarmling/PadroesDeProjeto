package decorator.decorator2;

public class Sistema {

    public static void main(String[] args) {
        PedidoBase pedido = new Pedido(100);
        System.out.println(pedido.getTotal());
        pedido.concluir();

        PedidoBase correios = new Frete(pedido, 0);
        System.out.println(correios.getTotal());
        correios.concluir();

        PedidoBase whatsapp = new Mensagem(pedido, "(49) 99821-0331");
        whatsapp.concluir();
    }
}
