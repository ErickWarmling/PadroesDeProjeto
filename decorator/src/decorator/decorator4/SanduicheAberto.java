package decorator.decorator4;

public class SanduicheAberto implements Sanduiche {

    private double preco = 3;

    @Override
    public double getPreco() {
        return preco;
    }
}
