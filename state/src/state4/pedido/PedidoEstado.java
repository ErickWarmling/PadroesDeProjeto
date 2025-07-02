package state4.pedido;

public abstract class PedidoEstado {

    protected Pedido pedido;

    public PedidoEstado(Pedido pedido) {
        this.pedido = pedido;
    }

    public void analisar () throws Exception {
        throw new Exception("Comando inválido");
    }

    public void suspender () throws Exception {
        throw new Exception("Comando inválido");
    }

    public void retomar () throws Exception {
        throw new Exception("Comando inválido");
    }

    public void cancelar () throws Exception {
        throw new Exception("Comando inválido");
    }

    public void aprovar () throws Exception {
        throw new Exception("Comando inválido");
    }

    public void atender () throws Exception {
        throw new Exception("Comando inválido");
    }
}