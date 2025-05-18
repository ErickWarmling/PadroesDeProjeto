package visitor6.visitor;

import visitor6.equipe.Funcionario;
import visitor6.equipe.Projeto;

public abstract class Visitor {

    protected Projeto projeto;

    public Visitor(Projeto projeto) {
        this.projeto = projeto;
    }

    public abstract void visitFuncionario(Funcionario fun) throws Exception;

    public Projeto getProjeto() {
        return projeto;
    }
}
