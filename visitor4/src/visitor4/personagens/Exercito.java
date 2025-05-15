package visitor4.personagens;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Exercito {

    private List<Personagem> personagens = new ArrayList<>();

    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    public void accept(Visitor visitor) throws Exception {
        for(Personagem personagem: personagens) {
            personagem.accept(visitor);
        }
    }
}
