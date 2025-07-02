package state5.estados;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AguardandoCorrecoes extends EstadoArtigo {

    public AguardandoCorrecoes(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void corrigido() throws Exception {
        artigo.setEstado(new SubmetidoComCorrecoes(artigo));
    }

    @Override
    public String toString() {
        return "Aguardando Correções";
    }
}
