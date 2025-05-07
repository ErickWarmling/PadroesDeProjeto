package abstractfactory3.Exportacao;

import abstractfactory3.controle.abstractfactory.AbstractFreteFactory;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class FactoryExportar extends AbstractFreteFactory {
    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new ExportacaoExpresso();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new ExportacaoNormal();
    }
}
