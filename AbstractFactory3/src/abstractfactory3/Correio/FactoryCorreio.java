package abstractfactory3.Correio;

import abstractfactory3.controle.abstractfactory.AbstractFreteFactory;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class FactoryCorreio extends AbstractFreteFactory {
    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new CorreioExpresso();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new CorreioNormal();
    }
}
