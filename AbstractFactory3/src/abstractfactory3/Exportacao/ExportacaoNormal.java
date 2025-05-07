package abstractfactory3.Exportacao;

import abstractfactory3.controle.abstractfactory.Destino;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class ExportacaoNormal extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        this.setDestino(Destino.AMERICADONORTE);
        if (this.getPeso() <= 0 || this.getCubagem() <= 0) {
            throw new Exception("O peso e a cubagem precisam ser maiores que zero");
        }

        float fatorModificacao = 0;
        if(this.getCubagem() <= 21600) {
            fatorModificacao = (float) 0.3;
        } else if (this.getCubagem() <= 27000) {
            fatorModificacao = (float) 0.7;
        } else {
            fatorModificacao = (float) 1.0;
        }

        return this.getCubagem() * 0.009 + this.getPeso() * fatorModificacao * 0.005;
    }
}
