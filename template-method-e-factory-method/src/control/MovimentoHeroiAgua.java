package control;

import model.Agua;
import model.Heroi;
import model.HeroiAgua;
import model.Peca;

public class MovimentoHeroiAgua extends MovimentoHeroi {
    @Override
    protected Heroi criarPeca() {
        return new HeroiAgua();
    }

    @Override
    protected boolean validarOutrosTiposCasas(Peca peca) {
        return peca.getClass() == Agua.class;
    }
}
