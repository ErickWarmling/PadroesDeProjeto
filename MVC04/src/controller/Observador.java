package controller;

public interface Observador {

    void iniciarCompra();
    void navegarProdutoAnterior();
    void navegarProdutoPosterior();
    void addProdutoPedido();
    void concluirPedido();
}
