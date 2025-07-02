package decorator.decorator3;

public class Cripto extends TextoDecorator {

    public Cripto(Texto texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < super.getTexto().length(); i++) {
            char caractereCriptografado = (char) (super.getTexto().charAt(i) + 1);
            resultado.append(caractereCriptografado);
        }
        return resultado.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
