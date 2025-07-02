package decorator.decorator5;

public abstract class OrcDecorator implements OrcBase {

    private OrcBase orcBase;

    public OrcDecorator(OrcBase orcBase) {
        this.orcBase = orcBase;
    }

    @Override
    public int getSaude() {
        return orcBase.getSaude();
    }

    @Override
    public void setSaude(int saude) {
        orcBase.setSaude(saude);
    }

    @Override
    public int atacar() {
        return orcBase.atacar();
    }

    @Override
    public void defender(int ataque) {
        orcBase.defender(ataque);
    }
}
