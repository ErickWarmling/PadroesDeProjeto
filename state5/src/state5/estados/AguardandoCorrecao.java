package state5.estados;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AguardandoCorrecao extends EstadoArtigo {

    public AguardandoCorrecao(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void corrigido() throws Exception {
        artigo.setEstado(new SubmetidoComCorrecao(artigo));
    }

    @Override
    public String toString() {
        return "Aguardando Correção";
    }
}
