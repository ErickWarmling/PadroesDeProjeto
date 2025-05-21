package abstractfactory4.Controller;

public interface Observador {

    void iniciarJogo(double macas, double lenhas, double pedras, double dinheiro, int round);
    void adicionarColhedor (int populacaoAtual, double dinheiro, int limitePopulacional);
    void adicionarLenhador (int populacaoAtual, double dinheiro, int limitePopulacional);
    void adicionarMinerador (int populacaoAtual, double dinheiro, int limitePopulacional);
}
