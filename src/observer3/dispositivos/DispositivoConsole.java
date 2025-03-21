package observer3.dispositivos;

public class DispositivoConsole implements observer3.Observador {

    @Override
    public void atualizarClima(double temp, double umid) {
        System.out.println("Temp: " + temp);
        System.out.println("Umid: " + umid);
    }
    
	
}
