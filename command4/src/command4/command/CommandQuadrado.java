package command4.command;

import java.util.List;


public class CommandQuadrado extends PaintCommand {


    private String dados;

    public CommandQuadrado(List<String> desenhos, String string) {
        super(desenhos);
        this.dados = string;
    }

    @Override
    public void execute() {
        super.desenhos.add(dados);
    }

    @Override
    public void undo() {
        super.desenhos.remove(dados);

    }

    @Override
    public void redo() {
        execute();
    }

}

