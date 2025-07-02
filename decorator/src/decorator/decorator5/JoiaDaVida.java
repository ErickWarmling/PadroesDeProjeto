package decorator.decorator5;

public class JoiaDaVida extends OrcDecorator{

    public JoiaDaVida(OrcBase orcBase) {
        super(orcBase);
    }

    @Override
    public int getSaude() {
        return (int) (super.getSaude() + super.getSaude() * 0.2);
    }
}
