package command5.observer;

import command5.Musica;

public interface Observer {

    void listarCarrinho(Musica mus);
    void tamanhoMusica(int tamTotal);
    void precoTotal(float precoTotal);

}
