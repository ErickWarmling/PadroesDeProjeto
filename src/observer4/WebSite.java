package observer4;

public class WebSite implements Observador{

    private String url;

    public WebSite(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public void atualizar(Revista revista, Edicao edicao) {
        System.out.println("==================== Notificação WebSite ====================");
        System.out.println("Revista: " + revista.getNome());
        System.out.println("Edição: " + edicao.getNumero());
        System.out.println("Artigos: ");
        for(Artigo artigo : edicao.getArtigos()) {
            System.out.println(artigo.getTitulo());
        }
    }
}
