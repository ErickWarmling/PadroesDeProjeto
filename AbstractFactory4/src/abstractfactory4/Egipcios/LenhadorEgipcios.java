package abstractfactory4.Egipcios;

import abstractfactory4.abstractFactory.Trabalhador;

public class LenhadorEgipcios extends Trabalhador {

    public LenhadorEgipcios() {
        this.produtividade = 0.5;
    }

    @Override
    public void proximoRound() {
        this.produtividade *= 1.01;
    }
}
