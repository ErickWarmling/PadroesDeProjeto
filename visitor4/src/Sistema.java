import visitor.ArqueiroVisitor;
import visitor.CatapultaVisitor;
import visitor.LanceiroVisitor;
import visitor4.personagens.*;

public class Sistema {
    public static void main(String[] args) throws Exception {
        Personagem arqueiro = new Arqueiro();
        Personagem catapulta = new Catapulta();
        Personagem lanceiro = new Lanceiro();

        Exercito exercito = new Exercito();
        exercito.addPersonagem(arqueiro);
        exercito.addPersonagem(catapulta);
        exercito.addPersonagem(lanceiro);

        System.out.println("Ponto de vida iniciais: ");
        System.out.println("Arqueiro: " + arqueiro.getPontoVida());
        System.out.println("Catapulta: " + catapulta.getPontoVida());
        System.out.println("Lanceiro: " + lanceiro.getPontoVida());
        System.out.println("----------------------------------------");

        ArqueiroVisitor arqueiroVisitor = new ArqueiroVisitor(arqueiro);
        exercito.accept(arqueiroVisitor);
        System.out.println("Após ataque do Arqueiro: ");
        System.out.println("Arqueiro: " + arqueiro.getPontoVida());
        System.out.println("Catapulta: " + catapulta.getPontoVida());
        System.out.println("Lanceiro: " + lanceiro.getPontoVida());
        System.out.println("----------------------------------------");

        CatapultaVisitor catapultaVisitor = new CatapultaVisitor(catapulta);
        exercito.accept(catapultaVisitor);
        System.out.println("Após ataque da Catapulta: ");
        System.out.println("Arqueiro: " + arqueiro.getPontoVida());
        System.out.println("Catapulta: " + catapulta.getPontoVida());
        System.out.println("Lanceiro: " + lanceiro.getPontoVida());
        System.out.println("----------------------------------------");

        LanceiroVisitor lanceiroVisitor = new LanceiroVisitor(lanceiro);
        exercito.accept(lanceiroVisitor);
        System.out.println("Após ataque do Lanceiro: ");
        System.out.println("Arqueiro: " + arqueiro.getPontoVida());
        System.out.println("Catapulta: " + catapulta.getPontoVida());
        System.out.println("Lanceiro: " + lanceiro.getPontoVida());
    }
}
