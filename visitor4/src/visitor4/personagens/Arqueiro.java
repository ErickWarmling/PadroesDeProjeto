package visitor4.personagens;

import visitor.Visitor;

public class Arqueiro extends Personagem {

	public Arqueiro() {
		super(15, 2);
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.ataqueArqueiro(this);
	}
}
