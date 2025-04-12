package controller;

public interface Observador {
    
    void inicio (String label_choice, String label_winner, int choice_human, int choice_computer, int score_human, int score_win, int score_tie);
}
