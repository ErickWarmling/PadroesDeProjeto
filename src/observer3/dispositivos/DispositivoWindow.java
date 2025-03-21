package observer3.dispositivos;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DispositivoWindow extends JFrame implements observer3.Observador {

	private static final long serialVersionUID = 1L;

	private JLabel jlTemp;
	private JLabel jlUmidade;

	public DispositivoWindow() {
	
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jlTemp = new JLabel("Temp:");
		getContentPane().add(jlTemp, "North");
		
		jlUmidade = new JLabel("Umidade:");
		getContentPane().add(jlUmidade, "South");
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

    @Override
    public void atualizarClima(double temp, double umid) {
        jlTemp.setText("Temp: " + temp);
        jlUmidade.setText("Umid: " + umid);
    }

}
