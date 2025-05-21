package abstractfactory4.Gregos;

import abstractfactory4.abstractFactory.Trabalhador;

public class ColhedorGregos extends Trabalhador {

    public ColhedorGregos() {
        this.produtividade = 1;
    }

    @Override
    public void proximoRound() {
        this.produtividade *= 1.01;
    }
}
