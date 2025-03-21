package observer4;

import java.util.ArrayList;
import java.util.List;

public class Revista {

    private String nome;
    private List<Observador> observadores = new ArrayList<>();
    private List<Edicao> edicoes = new ArrayList<>();

    public Revista(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void anexarObservadores (Observador observador) {
        this.observadores.add(observador);
    }

    public void lancarNovaEdicao(Edicao edicao) {
        this.edicoes.add(edicao);
        notificar(edicao);
    }

    public void notificar(Edicao edicao) {
        for (Observador obs : observadores) {
            obs.atualizar(this, edicao);
        }
    }
}
