package decorator.decorator5;

public class Escudo extends OrcDecorator {

    public Escudo(OrcBase orcBase) {
        super(orcBase);
    }

    @Override
    public void defender(int ataque) {
        super.defender(ataque);

        int ataqueRealizado = ataque - 7;
        if (ataqueRealizado > 0) {
            setSaude(ataqueRealizado);
        }
    }
}
