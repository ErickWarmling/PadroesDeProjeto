package command3.command;

import command3.dao.BancoPessoas;
import command3.observer.Observer;

public class NewCommand extends Command {

	private final String[] dados;
	private int id;

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		this.dados = dados;
	}

	@Override
	public void execute() {
		this.id = BancoPessoas.getInstance().addPessoa(Integer.parseInt(dados[0]), dados[1]);
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().removerPessoa(id);
	}

	@Override
	public void redo() {
		execute();
	}

}
