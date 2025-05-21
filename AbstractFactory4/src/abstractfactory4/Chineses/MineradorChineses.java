package abstractfactory4.Chineses;

import abstractfactory4.abstractFactory.Trabalhador;

public class MineradorChineses extends Trabalhador{

    public MineradorChineses() {
        this.produtividade = 0.2;
    }

    @Override
    public void proximoRound() {
        this.produtividade *= 1.01;
    }
}
