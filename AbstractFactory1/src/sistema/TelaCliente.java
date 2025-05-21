package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import dao.abstractfactory.ClienteDados;
import dao.abstractfactory.DadosFactory;
import dao.abstractfactory.PedidoDados;
import dao.randomaccessfactory.DadosRandomAccess;
import dao.xmlfactory.DadosXML;

public class TelaCliente {

	public static void main(String[] args) throws Exception {

		DadosFactory dadosFac = createFactory();
		ClienteDados cliDados = dadosFac.createCliente();
		PedidoDados pediDados = dadosFac.createPedido();
		// daqui por diante a aplicacao usado cliDados e pediDados sem realmente saber se eh XML ou RandomAccess
		
		cliDados.ler();
		cliDados.imprimir();
		
		pediDados.ler();
		pediDados.lerItens();
		
	}

	private static DadosFactory createFactory() throws Exception {
		// com base na leitura de algum arquivo de configuracao
	   	Properties props = new Properties();
    	props.load(new InputStreamReader(new FileInputStream(new File("conf.properties"))));
    	String factory = props.getProperty("factory");
    	if (factory.equals("xml"))
    		return new DadosXML();
    	else
    		return new DadosRandomAccess();
	}

}
