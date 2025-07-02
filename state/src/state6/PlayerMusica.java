package state6;

import state6.estados.Desligado;
import state6.estados.EstadoPlayerMusica;

public class PlayerMusica {

	private int tocando; // 0-stop 1-tocando 2-pause
	private Disco disco;
    private boolean ligado;
	private EstadoPlayerMusica estado;

	public PlayerMusica(Disco disco) {
		this.disco = disco;
		this.tocando = 0;
		this.estado = new Desligado(this);
	}

	public void setEstado(EstadoPlayerMusica estado) {
		this.estado = estado;
	}

    public Disco getDisco() {
		return disco;
	}

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public void play() throws Exception {
		/*if (!ligado)
			return;
		
		if (tocando == 0 || tocando == 2) {
			tocando = 1;
			disco.getFaixa().tocar();
		} else {
			if (tocando == 1) {
				tocando = 2;
				disco.getFaixa().pause();
			}
		}*/
        estado.play();
    }
	
	public void stop() throws Exception {
		/*if (!ligado)
			return ;
		
		if (tocando > 0) {
			tocando = 0;
			disco.getFaixa().parar();
		}*/
        estado.stop();
    }
	
	public void next() throws Exception {
		/*if (!ligado)
			return;
		
		if (tocando == 1)
			disco.getFaixa().praFrente();
		else
			if (tocando == 0)
				disco.proxFaixa();*/

        estado.next();
    }
	
	public void prev() throws Exception {
		/*if (!ligado)
			return;
		
		if (tocando == 1)
			disco.getFaixa().praTras();
		else
			if (tocando == 0)
				disco.voltarFaixa();*/

        estado.prev();
    }
	
	public void ligar() throws Exception {
		/*if (!ligado) {
			ligado = true;
			tocando = 0;
		}*/

        estado.ligar();
    }
	
	public void desligar() throws Exception {
		
		/*if (ligado)
			ligado = false;*/

        estado.desligar();
    }

	public String getStatus() {
		//return (!ligado?"Desligado":(tocando == 0?"Parado ":((tocando == 1?"Tocando ":"Pause ")) + disco.getFaixa()));
        return "Estado: " + estado;
	}
	
}
