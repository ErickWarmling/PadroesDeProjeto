package visitor;

import visitor5.taxi.Cliente;
import visitor5.taxi.Taxi;

public abstract class Visitor {

    protected Cliente cliente;

    public Visitor(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract void buscarTaxi(Taxi taxi);

    public Cliente getCliente() {
        return cliente;
    }

}
