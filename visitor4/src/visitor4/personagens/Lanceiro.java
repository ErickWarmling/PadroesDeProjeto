package visitor4.personagens;

import visitor.Visitor;

public class Lanceiro extends Personagem {

	public Lanceiro() {
		super(10, 1);
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.ataqueLanceiro(this);
	}
}