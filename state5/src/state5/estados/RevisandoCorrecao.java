package state5.estados;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class RevisandoCorrecao extends EstadoArtigo {

    public RevisandoCorrecao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void correcoesRevisadas(int nota) throws Exception {
        artigo.addNotaCorrecaoRevisor(nota);
        artigo.setEstado(this);
    }

    @Override
    public void proxEstado() {
        if (artigo.getQuantasRevisoesCorrecao() == artigo.getRevista().getQtosRevisores()) {
            artigo.setEstado(new AvaliandoCorrecao(artigo));
        }
    }

    @Override
    public String toString() {
        return "Revisando Correção";
    }
}
