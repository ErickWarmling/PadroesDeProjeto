package decorator.decorator2;

public class Sistema {

    public static void main(String[] args) {
        PedidoBase pedido1 = new Pedido(150);
        System.out.println(pedido1.getTotal());
        pedido1.concluir();

        PedidoBase pedido2 = new Pedido(300);
        System.out.println(pedido2.getTotal());
        pedido2.concluir();

        PedidoBase correios = new Frete(pedido1, 0);
        System.out.println(correios.getTotal());
        correios.concluir();

        PedidoBase transportadora = new Frete(pedido2, 1);
        System.out.println(transportadora.getTotal());
        transportadora.concluir();

        PedidoBase whatsapp = new Mensagem(pedido1, "(49) 99821-0331");
        whatsapp.concluir();
    }
}
