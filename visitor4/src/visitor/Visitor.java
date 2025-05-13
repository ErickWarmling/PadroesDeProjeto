package visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.personagens.Personagem;

public abstract class Visitor {

    protected Personagem personagem;

     public Visitor(Personagem personagem) {
         this.personagem = personagem;
     }

    public abstract void ataqueArqueiro(Arqueiro arqueiro);
    public abstract void ataqueCatapulta(Catapulta catapulta);
    public abstract void ataqueLanceiro(Lanceiro lanceiro);

    public Personagem getPersonagem() {
        return personagem;
    }
}
