package visitor6;

import java.util.ArrayList;
import java.util.List;

import visitor6.equipe.Funcionario;
import visitor6.equipe.Projeto;
import visitor6.visitor.Visitor;
import visitor6.visitor.VisitorCustoProjeto;
import visitor6.visitor.VisitorFimProjeto;
import visitor6.visitor.VisitorMontarEquipe;

public class Sistema {

	private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static void main(String[] args) throws Exception {
		
		funcionarios.add(new Funcionario("A", 1500, "Programador"));
		funcionarios.add(new Funcionario("B", 2500, "Analista"));
		funcionarios.add(new Funcionario("C", 3500, "Projetista"));
		funcionarios.add(new Funcionario("D", 5000, "Analista", "Programador"));
		funcionarios.add(new Funcionario("E", 5200, "Programador", "Analista"));
		funcionarios.add(new Funcionario("F", 8500, "Programador", "Projetista", "Analista"));
		funcionarios.add(new Funcionario("G", 8700, "Analista", "Programador", "Projetista"));
		funcionarios.add(new Funcionario("H", 8700, "Programador", "Projetista", "Analista"));
		funcionarios.add(new Funcionario("I", 1500, "Programador"));
		funcionarios.add(new Funcionario("J", 2500, "Analista"));
		funcionarios.add(new Funcionario("K", 3500, "Projetista"));		
		
		// nao pode mudar as linhas acima.... tudo o que for novo deve vir daqui para baixo
                // sugiro que crie metodos estaticos para atender os testes

		Projeto projetoA = new Projeto("Projeto A", 1, 0, 3);
		Projeto projetoB = new Projeto("Projeto B", 1, 2, 2);
		Projeto projetoC = new Projeto("Projeto C", 1, 3, 3);

		VisitorMontarEquipe visitorMontarEquipe1 = new VisitorMontarEquipe(projetoA);
		accept(visitorMontarEquipe1);
		System.out.println("Situação: " + visitorMontarEquipe1.situacaoEquipe());
		System.out.println("Membros: " + visitorMontarEquipe1.membrosEquipe());
		System.out.println("----------------------------------------------------");

		VisitorMontarEquipe visitorMontarEquipe2 = new VisitorMontarEquipe(projetoB);
		accept(visitorMontarEquipe2);
		System.out.println("Situação: " + visitorMontarEquipe2.situacaoEquipe());
		System.out.println("Membros: " + visitorMontarEquipe2.membrosEquipe());
		System.out.println("----------------------------------------------------");

		VisitorMontarEquipe visitorMontarEquipe3 = new VisitorMontarEquipe(projetoC);
		accept(visitorMontarEquipe3);
		System.out.println("Situação: " + visitorMontarEquipe3.situacaoEquipe());
		System.out.println("Membros: " + visitorMontarEquipe3.membrosEquipe());
		System.out.println("----------------------------------------------------");

		VisitorCustoProjeto visitorCustoProjeto1 = new VisitorCustoProjeto(projetoA);
		accept(visitorCustoProjeto1);
		System.out.println("Custo do " + projetoA.getNomeProjeto() + " é: R$" + visitorCustoProjeto1.getTotalSalario());
		System.out.println("----------------------------------------------------");

		VisitorFimProjeto visitorFimProjeto1 = new VisitorFimProjeto(projetoA);
		accept(visitorFimProjeto1);
		System.out.println(projetoA.getNomeProjeto() + " finalizado!");
		System.out.println("----------------------------------------------------");

		accept(visitorMontarEquipe3);
		System.out.println("Situação: " + visitorMontarEquipe3.situacaoEquipe());
		System.out.println("Membros: " + visitorMontarEquipe3.membrosEquipe());
		System.out.println("----------------------------------------------------");

		VisitorCustoProjeto visitorCustoProjeto2 = new VisitorCustoProjeto(projetoB);
		accept(visitorCustoProjeto2);
		System.out.println("Custo do " + projetoB.getNomeProjeto() + " é: R$" + visitorCustoProjeto2.getTotalSalario());
		System.out.println("----------------------------------------------------");

		VisitorFimProjeto visitorFimProjeto2 = new VisitorFimProjeto(projetoB);
		accept(visitorFimProjeto2);
		System.out.println(projetoB.getNomeProjeto() + " finalizado!");
		System.out.println("----------------------------------------------------");

		accept(visitorMontarEquipe3);
		System.out.println("Situação: " + visitorMontarEquipe3.situacaoEquipe());
		System.out.println("Membros: " + visitorMontarEquipe3.membrosEquipe());
		System.out.println("----------------------------------------------------");

		VisitorCustoProjeto visitorCustoProjeto3 = new VisitorCustoProjeto(projetoC);
		accept(visitorCustoProjeto3);
		System.out.println("Custo do " + projetoC.getNomeProjeto() + " é: R$" + visitorCustoProjeto3.getTotalSalario());
		System.out.println("----------------------------------------------------");

		VisitorFimProjeto visitorFimProjeto3 = new VisitorFimProjeto(projetoC);
		accept(visitorFimProjeto3);
		System.out.println(projetoC.getNomeProjeto() + " finalizado!");
	}

	public static void accept(Visitor visitor) throws Exception {
		for (Funcionario funcionario : funcionarios) {
			funcionario.accept(visitor);
		}
	}

}


 