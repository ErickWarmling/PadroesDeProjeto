package abstractfactory2.fiat;

import abstractfactory2.abstractFactory.CarroSedan;

public class PalioSedan implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Palio\nF�brica:Fiat\nCategoria:Sedan");
    }

    private int bagagem;
    private int rack;

    @Override
    public void colocarBagagem(int kg) throws Exception {
        if(kg + bagagem + rack <= 400) {
            if (kg + bagagem <= 300){
                bagagem += kg;
            } else if(kg + rack <= 100) {
                rack += kg;
            }
        } else {
            throw new Exception("Excesso de bagagem");
        }

    }

    @Override
    public int getKgBagageiro() {
        return bagagem;
    }
}
