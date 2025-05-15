import visitor.Atendimento;
import visitor.TaxiVisitor;
import visitor5.taxi.Cliente;
import visitor5.taxi.Taxi;

public class Sistema {
    public static void main(String[] args) throws Exception {
        Taxi taxi1 = new Taxi(100, 1);
        Taxi taxi2 = new Taxi(101, 2);
        Taxi taxi3 = new Taxi(102, 2);
        Taxi taxi4 = new Taxi(103, 1);
        Taxi taxi5 = new Taxi(104, 3);

        Atendimento atendimento = new Atendimento();

        atendimento.adicionarTaxi(taxi1);
        atendimento.adicionarTaxi(taxi2);
        atendimento.adicionarTaxi(taxi3);
        atendimento.adicionarTaxi(taxi4);
        atendimento.adicionarTaxi(taxi5);

        Cliente cliente1 = new Cliente(1, "91234");
        Cliente cliente2 = new Cliente(2, "95678");
        Cliente cliente3 = new Cliente(4, "9000");
        Cliente cliente4 = new Cliente(1, "92468");
        Cliente cliente5 = new Cliente(1, "90001");

        TaxiVisitor t1 = new TaxiVisitor(cliente1);
        TaxiVisitor t2 = new TaxiVisitor(cliente2);
        TaxiVisitor t3 = new TaxiVisitor(cliente3);
        TaxiVisitor t4 = new TaxiVisitor(cliente4);
        TaxiVisitor t5 = new TaxiVisitor(cliente5);

        atendimento.accept(t1);
        atendimento.accept(t2);
        atendimento.accept(t3);
        atendimento.accept(t4);
        atendimento.accept(t5);
    }
}
