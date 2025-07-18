package decorator.decorator4;

public abstract class SanduicheDecorator implements Sanduiche{

    private Sanduiche sanduiche;

    public SanduicheDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public double getPreco() {
        return this.sanduiche.getPreco();
    }
}
