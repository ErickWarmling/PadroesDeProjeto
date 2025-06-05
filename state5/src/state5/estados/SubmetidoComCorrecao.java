package state5.estados;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class SubmetidoComCorrecao extends EstadoArtigo {

    public SubmetidoComCorrecao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void correcoesRevisadas(int nota) throws Exception {
        artigo.addNotaCorrecaoRevisor(nota);
        artigo.setEstado(new RevisandoCorrecao(artigo));
    }

    @Override
    public String toString() {
        return "Submetido com Correção";
    }
}
