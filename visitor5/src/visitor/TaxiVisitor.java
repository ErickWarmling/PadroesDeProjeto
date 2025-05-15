package visitor;

import visitor5.taxi.Cliente;
import visitor5.taxi.Taxi;

public class TaxiVisitor extends Visitor {

    public TaxiVisitor(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void buscarTaxi(Taxi taxi) {
        if(!taxi.isOcupado() && taxi.getPontoTaxi() == cliente.getPontoProximo()) {
            taxi.atender(cliente);
        }
    }
}
