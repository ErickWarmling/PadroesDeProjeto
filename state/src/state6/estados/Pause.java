package state6.estados;

import state6.PlayerMusica;

public class Pause extends EstadoPlayerMusica {

    public Pause(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void stop() throws Exception {
        playerMusica.getDisco().getFaixa().parar();
        playerMusica.setEstado(new Parado(playerMusica));
    }

    @Override
    public void play() throws Exception {
        playerMusica.getDisco().getFaixa().tocar();
        playerMusica.setEstado(new Tocando(playerMusica));
    }

    @Override
    public void desligar() throws Exception {
        playerMusica.setEstado(new Desligado(playerMusica));
    }

    @Override
    public String toString() {
        return "Pause" + playerMusica.getDisco().getFaixa();
    }
}
