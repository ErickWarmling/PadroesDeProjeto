package abstractfactory3.Exportacao;

import abstractfactory3.controle.abstractfactory.Encomenda;

public class ExportacaoExpresso extends Encomenda{

    @Override
    public double getPreco() throws Exception {
        throw new Exception("Modo não suportado de frete");
    }
}
