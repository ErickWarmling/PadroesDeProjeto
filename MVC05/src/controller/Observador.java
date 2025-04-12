package controller;

public interface Observador {

    void inicioJogo(int index, int r, int c);
    void guardar (int i, int x);
    void fimJogo();
    void encontrarCarta (int r, int c);
    void cartaDiferente(int i, int x, int r, int c);

}
