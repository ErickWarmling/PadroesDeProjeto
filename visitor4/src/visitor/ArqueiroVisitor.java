package visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.personagens.Personagem;

public class ArqueiroVisitor extends Visitor{

    public ArqueiroVisitor(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void ataqueArqueiro(Arqueiro arqueiro) {
        if (arqueiro != personagem) {
            arqueiro.setPontoVida(arqueiro.getPontoVida() - personagem.getForcaAtaque());
        }
    }

    @Override
    public void ataqueCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida() - personagem.getForcaAtaque());
    }

    @Override
    public void ataqueLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida() - (personagem.getForcaAtaque() + 1));
    }
}
