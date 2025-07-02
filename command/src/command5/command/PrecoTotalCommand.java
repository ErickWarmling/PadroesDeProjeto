package command5.command;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class PrecoTotalCommand implements Command {

    private CarrinhoCompras cc;
    private Observer observer;

    public PrecoTotalCommand(CarrinhoCompras cc, Observer observer) {
        this.cc = cc;
        this.observer = observer;
    }

    @Override
    public void execute() {
        float precoTotal = 0;
        for (Musica mus:cc.getProdutos()) {
            precoTotal += mus.getPreco();
        }
        observer.precoTotal(precoTotal);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
