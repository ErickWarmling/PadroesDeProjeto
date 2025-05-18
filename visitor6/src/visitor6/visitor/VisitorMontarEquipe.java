package visitor6.visitor;

import visitor6.equipe.Funcionario;
import visitor6.equipe.Projeto;

public class VisitorMontarEquipe extends Visitor {

    public VisitorMontarEquipe(Projeto projeto) {
        super(projeto);
    }

    private int qtdAnalistasRestante = projeto.getQtdAnalistas();
    private int qtdProjetistasRestante = projeto.getQtdProjetistas();
    private int qtdProgramadoresRestante = projeto.getQtdProgramadores();

    @Override
    public void visitFuncionario(Funcionario fun) {
        if (fun.getProjetoAtual() == null) {
            for (int i = 0; i < fun.getFuncoes().size(); i++) {
                if (fun.getFuncoes().get(i).equalsIgnoreCase("Analista") && qtdAnalistasRestante > 0) {
                    fun.setProjetoAtual(projeto.getNomeProjeto());
                    qtdAnalistasRestante--;
                    if (!projeto.getEquipe().contains(fun)) {
                        projeto.getEquipe().add(fun);
                    }
                }

                if (fun.getFuncoes().get(i).equalsIgnoreCase("Projetista") && qtdProjetistasRestante > 0) {
                    fun.setProjetoAtual(projeto.getNomeProjeto());
                    qtdProjetistasRestante--;
                    if (!projeto.getEquipe().contains(fun)) {
                        projeto.getEquipe().add(fun);
                    }
                }

                if (fun.getFuncoes().get(i).equalsIgnoreCase("Programador") && qtdProgramadoresRestante > 0) {
                    fun.setProjetoAtual(projeto.getNomeProjeto());
                    qtdProgramadoresRestante--;
                    if (!projeto.getEquipe().contains(fun)) {
                        projeto.getEquipe().add(fun);
                    }
                }
            }
        }
    }

    public String situacaoEquipe() {
        if (qtdAnalistasRestante <= 0 && qtdProjetistasRestante <= 0 && qtdProgramadoresRestante <= 0) {
            return "A equipe do "  + projeto.getNomeProjeto() + " está completa!";
        }
            return "A equipe do "  + projeto.getNomeProjeto() + " está incompleta!";
    }

    public String membrosEquipe() {
        String membrosEquipeProjeto = "";
        for (Funcionario funcionario : projeto.getEquipe()) {
            membrosEquipeProjeto += funcionario.getNome() + ", ";
        }
        return membrosEquipeProjeto;
    }

}
