package controller;

import java.util.ArrayList;
import java.util.List;
import model.Jogada;

public class GameController {
    
    private List<Observador> observadores = new ArrayList<>();
    private List<Jogada> jogadas = new ArrayList<>();
    
    public void addObservador(Observador obs) {
        this.observadores.add(obs);
    }
    
    private int score_human;
    private int score_win = 0;
    private int score_tie = 0;
    
    public void jogar (int choice_human) {
        int choice_computer = (int) (Math.random() * 3) + 1;
		
        Jogada jogada = new Jogada(choice_human, choice_computer);
        jogadas.add(jogada);

        String label_choice, label_winner = "";
        switch (jogada.getVitorioso()) {

                case 12:
                        label_choice = "Papel venceu!";
                        if (choice_human == 2)
                                score_human = 1;
                        break;
                case 13:
                        label_choice = "Pedra venceu!";
                        if (choice_human == 1)
                                score_human = 1;
                        break;
                case 23:
                        label_choice = "Tesoura venceu!";
                        if (choice_human == 3)
                                score_human = 1;
                        break;
                default:
                        label_choice = "Empate!";
                        score_human = 2;
                        score_tie += 1;
        }
        if (score_human == 1) {
                label_winner = "   Voc\u00ea venceu!";
                score_human = 0;
                score_win += 1;
        } else if (score_human == 2) {
                label_winner = "   Ningu\u00e9m venceu!";
                score_human = 0;
        } else {
                label_winner = "   Computador venceu!";
        }
        
        for (Observador obs : observadores){
            obs.inicio(label_choice, label_winner, choice_human, choice_computer, score_human, score_win, score_tie);
        }
    }
    
    public int sizeJogadas() {
        return jogadas.size();
    }
}
