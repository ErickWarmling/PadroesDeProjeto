package command3.command;

import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command3.observer.Observer;

public class GetCommand extends Command {

    private final String[] dados;

    public GetCommand(Observer observer, String[] dados) {
        super(observer);
        this.dados = dados;
    }

    @Override
    public void execute() {
        Pessoa pessoa = BancoPessoas.getInstance().getPessoa(Integer.parseInt(dados[0]));
        String[][] lerCodigo = new String[1][2];
        lerCodigo[0][0] = String.valueOf(pessoa.getId());
        lerCodigo[0][1] = String.valueOf(pessoa.getNome());

        this.observer.buscouDados(lerCodigo);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
