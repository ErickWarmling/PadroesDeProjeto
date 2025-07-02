package decorator.decorator3;

public class Cripto extends TextoDecorator {

    public Cripto(Texto texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < super.getTexto().length(); i++) {
            char caracterCriptografado = (char) (super.getTexto().charAt(i) + 1);
            resultado.append(caracterCriptografado);
        }
        return resultado.toString();
    }
}
