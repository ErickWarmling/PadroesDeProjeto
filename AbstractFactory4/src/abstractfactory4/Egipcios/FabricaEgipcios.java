package abstractfactory4.Egipcios;

import abstractfactory4.abstractFactory.CivilizacaoFactory;
import abstractfactory4.abstractFactory.Trabalhador;

public class FabricaEgipcios extends CivilizacaoFactory {
    @Override
    public Trabalhador criarColhedor() {
        return new ColhedorEgipcios();
    }

    @Override
    public Trabalhador criarLenhador() {
        return new LenhadorEgipcios();
    }

    @Override
    public Trabalhador criarMinerador() {
        return new MineradorEgipcios();
    }
}
