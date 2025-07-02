package command4.command;

import java.util.List;

public abstract class PaintCommand extends Command{

    protected List<String> desenhos;

    public PaintCommand(List<String> desenhos) {
        this.desenhos = desenhos;
    }

}

