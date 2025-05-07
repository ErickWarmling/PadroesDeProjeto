package abstractfactory3.Correio;

import abstractfactory3.controle.abstractfactory.Encomenda;

public class CorreioNormal extends Encomenda {
    @Override
    public double getPreco() throws Exception {
        double preco = 0;
        switch (this.getDestino()) {
            case NORTE:
                preco = 0.03;
                break;
            case CENTROOESTE:
                preco = 0.04;
                break;
            case NORDESTE:
                preco = 0.02;
                break;
            case SUDESTE:
                preco = 0.01;
                break;
            case SUL:
                preco = 0.01;
                break;
            case AMERICALATINA:
                preco = 0.07;
                break;
            case AMERICADONORTE:
                preco = 0.10;
                break;
            case EUROPA:
                preco = 0.15;
                break;
            case AFRICA:
                preco = 0.25;
                break;
            case ASIA:
                preco = 0.17;
                break;
            case OCEANIA:
                preco = 0.30;
                break;
            default:
                return 0;
        }

        return preco * this.getCubagem();
    }
}
