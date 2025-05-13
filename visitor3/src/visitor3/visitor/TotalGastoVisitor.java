package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class TotalGastoVisitor implements FuncionarioVisitor {

    private double folhaPagamento;

    @Override
    public void visitGerente(Gerente gerente) {
        folhaPagamento += gerente.getSalario();
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        folhaPagamento += funcionario.getSalario();
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        folhaPagamento += funcionario.getSalario();
    }

    public double getFolhaPagamento() {
        return folhaPagamento;
    }
}
