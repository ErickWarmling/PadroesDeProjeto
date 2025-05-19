package visitor;

import model.Card;

public class VisitorTrocarImagens implements Visitor {

    private int numeroImagem;

    @Override
    public void visitCard(Card card) {
        numeroImagem = card.getImgNum();

        if (numeroImagem >= 1 && numeroImagem <= 3) {
            card.setImgNum(numeroImagem + 3);
        } else if (numeroImagem >= 4 && numeroImagem <= 6) {
            card.setImgNum(numeroImagem - 3);
        }
    }
}
