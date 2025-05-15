package visitor;

import visitor5.taxi.Taxi;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private List<Taxi> taxis = new ArrayList<>();

    public void adicionarTaxi(Taxi taxi) {
        this.taxis.add(taxi);
    }

    public void accept(Visitor visitor) throws Exception{
        for(Taxi taxi : taxis) {
            if (!taxi.isOcupado()) {
                taxi.accept(visitor);
                if (taxi.isOcupado()) {
                    return;
                }
            }
        }
        System.out.println("Atendimento ligou para o cliente " + visitor.getCliente().getNumeroTelefone() + " avisando que não tem taxi");
    }
}
