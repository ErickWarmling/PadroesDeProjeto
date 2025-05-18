package visitor6.visitor;

import visitor6.equipe.Funcionario;
import visitor6.equipe.Projeto;

public class VisitorFimProjeto extends Visitor {

    public VisitorFimProjeto(Projeto projeto) {
        super(projeto);
    }

    @Override
    public void visitFuncionario(Funcionario fun) {
        if (fun.getProjetoAtual() != null && fun.getProjetoAtual().equalsIgnoreCase(projeto.getNomeProjeto())) {
            projeto.getEquipe().remove(fun);
            fun.setProjetoAtual(null);
        }
    }

}
