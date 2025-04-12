package controle;

import modelo.Mao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControladorJogoParImpar {

    private List<Observador> observadores = new ArrayList<>();

    public void addObservador(Observador obs) {
        this.observadores.add(obs);
    }

    private int minhaVit, pcVit;
    private int idxMao;
    private Random sorteio;
    private List<modelo.Mao> maos = new ArrayList<>();

    public ControladorJogoParImpar() {
        sorteio = new Random();
    }

    public void novo() {
        maos.clear();
        minhaVit = 0;
        pcVit = 0;

        for (Observador obs : observadores) {
            obs.iniciouJogo();
        }
    }

    public void posterior() {
        idxMao = (idxMao + 1) % 6;
        for (Observador obs : observadores) {
            obs.posteriorJogo();
        }
    }

    public void jogar(boolean ehPar) {
        int maoPC = sorteio.nextInt(6);

        Mao mao = new Mao(ehPar, maoPC, idxMao);
        maos.add(mao);
        
        for (Observador obs : observadores) {
            obs.maoPC(maoPC);
        }

        boolean vencePar = ((maoPC + idxMao)%2) == 0;
        if (mao.isPar() == vencePar) {
            minhaVit++;

            if (minhaVit == 3) {
                for(Observador obs : observadores) {
                    obs.vitoria();
                }
            }
        } else {
            pcVit++;
            if (pcVit == 3) {
                for (Observador obs : observadores) {
                    obs.derrota();
                }
            }
        }
    }

    public Mao getMao(int index) {
        return maos.get(index);
    }

    public int sizeMao() {
        return maos.size();
    }
}
