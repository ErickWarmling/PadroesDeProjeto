package visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.personagens.Personagem;

public class LanceiroVisitor extends Visitor {

    public LanceiroVisitor(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void ataqueArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida() - (personagem.getForcaAtaque() - 1));
    }

    @Override
    public void ataqueCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida() - personagem.getForcaAtaque());
    }

    @Override
    public void ataqueLanceiro(Lanceiro lanceiro) {
        if (lanceiro != personagem) {
            lanceiro.setPontoVida(lanceiro.getPontoVida() - personagem.getForcaAtaque());
        }
    }
}
