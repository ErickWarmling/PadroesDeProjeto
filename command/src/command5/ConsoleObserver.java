package command5;

import command5.observer.Observer;

public class ConsoleObserver implements Observer {

    @Override
    public void listarCarrinho(Musica mus) {
        System.out.println("> " + mus);
    }

    @Override
    public void tamanhoMusica(int tamTotal) {
        System.out.println("> " + tamTotal + " MB");
    }

    @Override
    public void precoTotal(float precoTotal) {
        System.out.println("> R$ " + precoTotal);
    }
}
