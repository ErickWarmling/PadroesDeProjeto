package state5.estados;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AceitoParaPublicacao extends EstadoArtigo {

    public AceitoParaPublicacao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void proxEstado() {
        if (artigo.getMediaRevisao() < artigo.getRevista().getNotaCortePublicacao()) {
            artigo.setEstado(new AguardandoCorrecao(artigo));
        } else {
            artigo.setEstado(new AprovadoParaPublicacao(artigo));
        }
    }

    @Override
    public String toString() {
        return "Aceito para Publicação";
    }
}
