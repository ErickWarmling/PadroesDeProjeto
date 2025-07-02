package state6.estados;

import state6.PlayerMusica;

public class Parado extends EstadoPlayerMusica {

    public Parado(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void play() throws Exception {
        playerMusica.getDisco().getFaixa().tocar();
        playerMusica.setEstado(new Tocando(playerMusica));
    }

    @Override
    public void next() throws Exception {
        playerMusica.getDisco().proxFaixa();
        playerMusica.setEstado(new Parado(playerMusica));
    }

    @Override
    public void prev() throws Exception {
        playerMusica.getDisco().voltarFaixa();
        playerMusica.setEstado(new Parado(playerMusica));
    }

    @Override
    public void desligar() throws Exception {
        playerMusica.setEstado(new Desligado(playerMusica));
    }

    @Override
    public String toString() {
        return "Parado";
    }
}
