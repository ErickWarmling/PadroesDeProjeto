package state6.estados;

import state6.PlayerMusica;

public abstract class EstadoPlayerMusica {

    protected PlayerMusica playerMusica;

    public EstadoPlayerMusica(PlayerMusica playerMusica) {
        this.playerMusica = playerMusica;
    }

    public void play() throws Exception{

    }

    public void stop() throws Exception{

    }

    public void ligar() throws Exception {

    }

    public void desligar() throws Exception {

    }

    public void prev() throws Exception {

    }

    public void next() throws Exception {

    }
}
