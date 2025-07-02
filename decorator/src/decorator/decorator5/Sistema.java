package decorator.decorator5;

public class Sistema {

    public static void main(String[] args) {
        OrcBasico orcBasico1 = new OrcBasico();
        System.out.println("Saúde: " + orcBasico1.getSaude());

        OrcBasico orcBasico2 = new OrcBasico();
        System.out.println("Saúde: " + orcBasico2.getSaude());

        OrcBase orcCompleto = new JoiaDaVida(new Machado(new Escudo(orcBasico1)));
        orcBasico2.defender(orcCompleto.atacar());
        orcCompleto.defender(orcBasico1.atacar());
        System.out.println("Saúde após ataque: " + orcBasico2.getSaude());
        System.out.println("Saúde após ataque: " + orcCompleto.getSaude());
    }
}
