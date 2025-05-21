package abstractfactory4.Controller;

import abstractfactory4.Chineses.FabricaChineses;
import abstractfactory4.Egipcios.FabricaEgipcios;
import abstractfactory4.Gregos.FabricaGregos;
import abstractfactory4.abstractFactory.CivilizacaoFactory;
import abstractfactory4.abstractFactory.Trabalhador;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    private List<Observador> observadores = new ArrayList<>();
    private List<Trabalhador> colhedores = new ArrayList<>();
    private List<Trabalhador> lenhadores = new ArrayList<>();
    private List<Trabalhador> mineradores = new ArrayList<>();
    private CivilizacaoFactory civilizacaoFactory;

    private int limitePopulacional = 0;
    private int populacaoAtual = 0;
    private double dinheiro = 50;
    private int round = 0;

    private double macas;
    private double lenhas;
    private double pedras;

    public void addObservadores(Observador obs) {
        this.observadores.add(obs);
    }

    public void iniciarJogo() {
        round++;
        double maca = 0;
        double lenha = 0;
        double pedra = 0;

        for (Trabalhador trabalhador : colhedores) {
            maca = trabalhador.produzir();
            this.macas += maca;
            trabalhador.proximoRound();
        }

        for (Trabalhador trabalhador : lenhadores) {
            lenha = trabalhador.produzir();
            this.lenhas += lenha;
            trabalhador.proximoRound();
        }

        for (Trabalhador trabalhador : mineradores) {
            pedra = trabalhador.produzir();
            this.pedras += pedra;
            trabalhador.proximoRound();
        }

        for (Observador obs : observadores) {
            obs.iniciarJogo(macas, lenhas, pedras, dinheiro, round);
        }
    }

    public void escolherCivilizacao(String civilizacao) {
        if(civilizacao.equalsIgnoreCase("Gregos")) {
            this.civilizacaoFactory = new FabricaGregos();
            limitePopulacional = 20;
        } else if (civilizacao.equalsIgnoreCase("Egípcios")) {
            this.civilizacaoFactory = new FabricaEgipcios();
            limitePopulacional = 20;
        } else if (civilizacao.equalsIgnoreCase("Chineses")) {
            this.civilizacaoFactory = new FabricaChineses();
            limitePopulacional = 50;
        }
    }

    public void adicionarColhedor() {
        if (civilizacaoFactory != null) {
            if ((populacao() < limitePopulacional) && dinheiro >= 1) {
                colhedores.add(civilizacaoFactory.criarColhedor());
                dinheiro -= 1;
                populacaoAtual++;

                for (Observador obs : observadores) {
                    obs.adicionarColhedor(populacaoAtual, dinheiro, limitePopulacional);
                }
            }
        }
    }

    public void adicionarLenhador() {
        if (civilizacaoFactory != null) {
            if ((populacao() < limitePopulacional) && dinheiro >= 2) {
                lenhadores.add(civilizacaoFactory.criarLenhador());
                dinheiro -= 2;
                populacaoAtual++;

                for (Observador obs : observadores) {
                    obs.adicionarLenhador(populacaoAtual, dinheiro, limitePopulacional);
                }
            }
        }
    }

    public void adicionarMinerador() {
        if (civilizacaoFactory != null) {
            if ((populacao() < limitePopulacional) && dinheiro >= 3) {
                mineradores.add(civilizacaoFactory.criarMinerador());
                dinheiro -= 3;
                populacaoAtual++;

                for (Observador obs : observadores) {
                    obs.adicionarMinerador(populacaoAtual, dinheiro, limitePopulacional);
                }
            }
        }
    }

    public int populacao() {
        return colhedores.size() + lenhadores.size() + mineradores.size();
    }

}
