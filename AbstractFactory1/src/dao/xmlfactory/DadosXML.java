package dao.xmlfactory;

import dao.abstractfactory.ClienteDados;
import dao.abstractfactory.DadosFactory;
import dao.abstractfactory.PedidoDados;

public class DadosXML extends DadosFactory {

	@Override
	public ClienteDados createCliente() {
		return new ClienteXML();
	}

	@Override
	public PedidoDados createPedido() {
		return new PedidoXML();
	}

}
