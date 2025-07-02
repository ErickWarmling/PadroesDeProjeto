package decorator.decorator5;

import java.util.Random;

public class Machado extends OrcDecorator {

    private static Random sorteio = new Random();

    public Machado(OrcBase orcBase) {
        super(orcBase);
    }

    @Override
    public int atacar() {
        return super.atacar() + sorteio.nextInt(1, 5);
    }
}
