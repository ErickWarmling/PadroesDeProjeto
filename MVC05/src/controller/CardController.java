package controller;

import model.Card;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardController {

    public static final int ROWS = 2;
    public static final int COLUMNS = 3;
    private Card[] cards = new Card[COLUMNS * ROWS];
    private int compareCards = 0;
    private int holdCardRow = 0;
    private int holdCardColumn = 0;
    private boolean isFirst = true;
    private int win = 0;
    private List<Observador> observadores = new ArrayList<>();

    public void addObservadores (Observador obs) {
        this.observadores.add(obs);
    }

    public CardController() {
        Random rgen = new Random();
        int z = 1;

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(-1, -1, z, false);
            if (i % 2 == 1) {
                z++;
            }
        }

        // --- embaralhar
        for (int i = 0; i < cards.length; i++) {
            int randomPosition = rgen.nextInt(cards.length);
            Card temp = cards[i];

            cards[i] = cards[randomPosition];
            cards[i].setX(i / COLUMNS);
            cards[i].setY(i % COLUMNS);

            cards[randomPosition] = temp;

            temp.setX(randomPosition / COLUMNS);
            temp.setY(randomPosition % COLUMNS);
        }
    }

    public void jogar(int r, int c) {
        int index = (r * COLUMNS) + c ;

        for (Observador obs : observadores) {
            obs.inicioJogo(cards[index].getImgNum(), r, c);
        }

        // guarda as variaveis da primeira carta a ser virada
        if (isFirst) {
            compareCards = cards[index].getImgNum();
            holdCardRow = r;
            holdCardColumn = c;
            isFirst = false;

            for (Observador obs : observadores) {
                obs.guardar(holdCardRow, holdCardColumn);
            }
        } else {
            // cartas iguais
            if (compareCards == cards[index].getImgNum()) {
                win++;
                // encontrou todas entao fim de jogo
                if (win == COLUMNS) {
                    for (Observador obs : observadores) {
                        obs.fimJogo();
                    }

                } else {
                    // encontrou um par entao desabilita para nao fazer mais pares
                    cards[(holdCardRow * COLUMNS)+holdCardColumn].setCorrect(true);
                    cards[index].setCorrect(true);

                    for (Observador obs : observadores) {
                        obs.encontrarCarta(r, c);
                    }
                }
            } else {
                // cartas diferentes
                for (Observador obs : observadores) {
                    obs.cartaDiferente(holdCardRow, holdCardColumn, r, c);
                }
            }
            isFirst = true;
        }
    }

}
