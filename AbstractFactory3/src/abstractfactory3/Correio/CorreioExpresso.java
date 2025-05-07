package abstractfactory3.Correio;

import abstractfactory3.controle.abstractfactory.Encomenda;

public class CorreioExpresso extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        double preco = 0;
        switch (this.getDestino()) {
            case NORTE:
            case NORDESTE:
                preco = this.getPeso() * 0.05;
                break;
            case CENTROOESTE:
                preco = this.getPeso() * 0.075;
                break;
            case SUL:
            case SUDESTE:
                preco = this.getPeso() * 0.025;
                break;
            default:
                return 0;
        }

        return preco;
    }
}
