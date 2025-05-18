package visitor6.visitor;

import visitor6.equipe.Funcionario;
import visitor6.equipe.Projeto;

public class VisitorCustoProjeto extends Visitor {

    public VisitorCustoProjeto(Projeto projeto) {
        super(projeto);
    }

    private double totalSalario;

    @Override
    public void visitFuncionario(Funcionario fun) {
        if (fun.getProjetoAtual() != null && fun.getProjetoAtual().equalsIgnoreCase(projeto.getNomeProjeto())) {
            totalSalario += fun.getSalario();
        }
    }

    public double getTotalSalario() {
        return totalSalario;
    }
}
