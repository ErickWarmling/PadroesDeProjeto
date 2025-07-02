package state6.estados;

import state6.PlayerMusica;

public class Desligado extends EstadoPlayerMusica {

    public Desligado(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void ligar() throws Exception {
        playerMusica.setEstado(new Parado(playerMusica));
    }

    @Override
    public String toString() {
        return "Desligado";
    }
}
