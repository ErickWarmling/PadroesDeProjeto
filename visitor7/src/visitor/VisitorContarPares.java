package visitor;

import model.Card;

public class VisitorContarPares implements Visitor{

    private int contCartas;

    @Override
    public void visitCard(Card card) {
        if (card.isCorrect()) {
            contCartas++;
        }
    }

    public int getContCartas() {
        return contCartas;
    }
}
