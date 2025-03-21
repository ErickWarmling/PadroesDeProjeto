package observer4;

public class Sistema {

    public static void main(String[] args) {

        Revista r1 = new Revista("R1");
        Revista r2 = new Revista("R2");

        Assinante a1 = new Assinante("A1", "Urubici - SC");
        Assinante a2 = new Assinante("A2", "Lages - SC");
        Assinante a3 = new Assinante("A3", "Florianópolis - SC");
        Assinante a4 = new Assinante("A4", "Ibirama - SC");

        r1.anexarObservadores(a1);
        r1.anexarObservadores(a3);
        r2.anexarObservadores(a2);
        r2.anexarObservadores(a4);

        WebSite w1 = new WebSite("www.udesc.br");

        r1.anexarObservadores(w1);
        r2.anexarObservadores(w1);

        Edicao edicaoR1 = new Edicao(1);

        Artigo t1 = new Artigo("Inteligência Artificial");
        Artigo t2 = new Artigo("Sistemas Paralelos e Distribuídos");

        edicaoR1.adicionarArtigo(t1);
        edicaoR1.adicionarArtigo(t2);

        Edicao edicaoR2 = new Edicao(1);

        Artigo t3 = new Artigo("Banco de Dados");
        Artigo t4 = new Artigo("Padrões de Projeto");
        Artigo t5 = new Artigo("Desenvolvimento Web");

        edicaoR2.adicionarArtigo(t3);
        edicaoR2.adicionarArtigo(t4);
        edicaoR2.adicionarArtigo(t5);

        System.out.println("==================== Nova Edição - Revista R1 ====================");
        r1.lancarNovaEdicao(edicaoR1);

        System.out.println("==================== Nova Edição - Revista R2 ====================");
        r2.lancarNovaEdicao(edicaoR2);
        System.out.println("=============================================================");
    }
}
