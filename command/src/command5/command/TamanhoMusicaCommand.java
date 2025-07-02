package command5.command;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class TamanhoMusicaCommand implements Command {

    private CarrinhoCompras cc;
    private Observer observer;

    public TamanhoMusicaCommand(CarrinhoCompras cc, Observer observer) {
        this.cc = cc;
        this.observer = observer;
    }


    @Override
    public void execute() {
        int tamTotal = 0;
        for (Musica mus:cc.getProdutos()) {
            tamTotal += mus.getTamanho();
        }
        observer.tamanhoMusica(tamTotal);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
