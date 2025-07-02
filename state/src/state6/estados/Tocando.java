package state6.estados;

import state6.PlayerMusica;

public class Tocando extends EstadoPlayerMusica {

    public Tocando(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void play() throws Exception {
        playerMusica.getDisco().getFaixa().pause();
        playerMusica.setEstado(new Pause(playerMusica));
    }

    @Override
    public void stop() throws Exception {
        playerMusica.getDisco().getFaixa().parar();
        playerMusica.setEstado(new Parado(playerMusica));
    }

    @Override
    public void desligar() throws Exception {
        playerMusica.setEstado(new Desligado(playerMusica));
    }

    @Override
    public void prev() throws Exception {
        playerMusica.getDisco().getFaixa().praTras();
    }

    @Override
    public void next() throws Exception {
        playerMusica.getDisco().getFaixa().praFrente();
    }

    @Override
    public String toString() {
        return "Tocando " + playerMusica.getDisco().getFaixa();
    }
}
