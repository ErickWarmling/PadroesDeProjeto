package command5.command;

import command5.BancoMusicas;
import command5.CarrinhoCompras;
import command5.Musica;

public class AdicionarCarrinhoCommand implements Command {

    private int opMusica;
    private CarrinhoCompras cc;

    public AdicionarCarrinhoCommand(int opMusica, CarrinhoCompras cc) {
        this.opMusica = opMusica;
        this.cc = cc;
    }

    @Override
    public void execute() {
        Musica m = BancoMusicas.getInstancia().getMusicas().get(opMusica);
        cc.add(m);
    }

    @Override
    public void undo() {
        Musica m = BancoMusicas.getInstancia().getMusicas().get(opMusica);
        cc.remove(m);
    }

    @Override
    public void redo() {
        execute();
    }
}
