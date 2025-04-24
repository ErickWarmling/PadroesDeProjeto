package control;

import model.*;

public class MovimentoHeroiMontanha extends MovimentoHeroi {
    @Override
    protected Heroi criarPeca() {
        return new HeroiMontanha();
    }

    @Override
    protected boolean validarOutrosTiposCasas(Peca peca) {
        return peca.getClass() == Montanha.class;
    }
}
