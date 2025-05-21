package abstractfactory4.Gregos;

import abstractfactory4.abstractFactory.CivilizacaoFactory;
import abstractfactory4.abstractFactory.Trabalhador;

public class FabricaGregos extends CivilizacaoFactory {

    @Override
    public Trabalhador criarColhedor() {
        return new ColhedorGregos();
    }

    @Override
    public Trabalhador criarLenhador() {
        return new LenhadorGregos();
    }

    @Override
    public Trabalhador criarMinerador() {
        return new MineradorGregos();
    }
}
