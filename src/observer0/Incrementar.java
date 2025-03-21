package observer0;

import java.util.ArrayList;
import java.util.List;

public class Incrementar {

	private Incrementar() {
	}

	private static Incrementar instancia;
	
	public static Incrementar getInstancia() {
		if (instancia == null)
			instancia = new Incrementar();
		
		return instancia;
	}
	
	private int conta;
	
	public int getConta() {
		return conta;
	}

	public void inc() {
		conta++;
                notificarObservadores();
	}
        
        //Padrão OBSERVER
        private List<ObservadorIncrementar> obss = new ArrayList<>();
        
        public void addObservador(ObservadorIncrementar obs) {
            obss.add(obs);
        }
        
        private void notificarObservadores() {
            for (ObservadorIncrementar obs : obss) {
                obs.altereiConta(conta);
            }
        }

}
