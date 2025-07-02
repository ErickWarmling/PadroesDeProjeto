package command3.command;

import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command3.observer.Observer;

public class DeleteCommand extends Command {

    private final String[] dados;
    private Pessoa pessoa;

    public DeleteCommand(Observer observer, String[] dados) {
        super(observer);
        this.dados = dados;
    }

    @Override
    public void execute() {
        pessoa = BancoPessoas.getInstance().removerPessoa(Integer.parseInt(dados[0]));
    }

    @Override
    public void undo() {
        BancoPessoas.getInstance().addPessoa(pessoa.getId(), pessoa.getNome());
    }

    @Override
    public void redo() {
        execute();
    }
}
