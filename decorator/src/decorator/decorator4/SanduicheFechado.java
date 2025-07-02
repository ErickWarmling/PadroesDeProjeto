package decorator.decorator4;

public class SanduicheFechado implements Sanduiche {

    private double preco = 1;

    @Override
    public double getPreco() {
        return preco;
    }
}
