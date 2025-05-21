package abstractfactory4.Chineses;

import abstractfactory4.abstractFactory.CivilizacaoFactory;
import abstractfactory4.abstractFactory.Trabalhador;

public class FabricaChineses extends CivilizacaoFactory {
    @Override
    public Trabalhador criarColhedor() {
        return new ColhedorChineses();
    }

    @Override
    public Trabalhador criarLenhador() {
        return new LenhadorChineses();
    }

    @Override
    public Trabalhador criarMinerador() {
        return new MineradorChineses();
    }
}
