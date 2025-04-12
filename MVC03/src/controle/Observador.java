package controle;

public interface Observador {

    void iniciouJogo();
    void posteriorJogo();
    void maoPC(int maoPC);
    void vitoria();
    void derrota();
}
