package visitor3;
import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;
import visitor3.empresa.Setor;
import visitor3.visitor.FeriasVisitor;
import visitor3.visitor.TotalGastoVisitor;

public class Sistema {

	public static void main(String[] args) throws Exception {

		FuncNivelA f1 = new FuncNivelA("J", 5000);
		FuncNivelA f2 = new FuncNivelA("K", 4500);
		
		FuncNivelB f3 = new FuncNivelB("X", 1200);
		FuncNivelB f4 = new FuncNivelB("Y", 1500);
		
		Gerente g = new Gerente("AAA", 8000);
		
		Setor s = new Setor();
		s.add(f1);
		s.add(f2);
		s.add(f3);
		s.add(f4);
		s.add(g);
		
		s.setGerente(g);

		TotalGastoVisitor totalGasto = new TotalGastoVisitor();
		s.accept(totalGasto);
		System.out.println("Folha de Pagamento: " + totalGasto.getFolhaPagamento());

		FeriasVisitor ferias = new FeriasVisitor();
		s.accept(ferias);
		System.out.println("Quantidade de funcionários que tiraram férias: " + ferias.getQtdFuncionariosFerias());
	}

}
