package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class FeriasVisitor implements FuncionarioVisitor {

    private int qtdFuncionariosFerias;

    @Override
    public void visitGerente(Gerente gerente) {
       if (gerente.getFeriasAGozar() >= 10) {
           gerente.setFeriasAGozar(gerente.getFeriasAGozar() - 10);
           qtdFuncionariosFerias++;
       }
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        if (funcionario.getFeriasAGozar() >= 10 && funcionario.getSalario() >= 5000) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 10);
            qtdFuncionariosFerias++;
        }
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        if (funcionario.getFeriasAGozar() >= 5 && funcionario.getSalario() >= 1500) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 5);
            qtdFuncionariosFerias++;
        }
    }

    public int getQtdFuncionariosFerias() {
        return qtdFuncionariosFerias;
    }
}
