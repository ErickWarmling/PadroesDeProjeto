package command5.command;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class ListarCarrinhoCommand implements Command {

    private CarrinhoCompras cc;
    private Observer observer;

    public ListarCarrinhoCommand(CarrinhoCompras cc, Observer observer) {
        this.cc = cc;
        this.observer = observer;
    }

    @Override
    public void execute() {
        for (Musica mus:cc.getProdutos()) {
            observer.listarCarrinho(mus);
        }
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
