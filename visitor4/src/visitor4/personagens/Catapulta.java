package visitor4.personagens;

import visitor.Visitor;

public class Catapulta extends Personagem {

	public Catapulta() {
		super(8, 5);
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.ataqueCatapulta(this);
	}
}
