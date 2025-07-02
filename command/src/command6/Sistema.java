package command6;

import command6.command.*;
import command6.observer.ConsoleObserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sistema {

	public static void main(String[] args) throws Exception {

		CommandInvoker commandInvoker = new CommandInvoker();
		ConsoleObserver observer = new ConsoleObserver();

		Cliente cliente = buscarCliente(1);
		Date date = converterData("17/05/2022");
		
		Hotel hotel = new Hotel();
		
		//hotel.reservar(date, 10, cliente);
		commandInvoker.execute(new ReservarCommand(hotel, date, 10, cliente));
		//hotel.cancelarReserva(date, 10, cliente);
		commandInvoker.execute(new CancelarReservaCommand(hotel, date, 10, cliente));
		
		//hotel.reservar(date, 15, cliente);
		commandInvoker.execute(new ReservarCommand(hotel, date, 15, cliente));
		
		//hotel.checkIn(date, 15, cliente);
		commandInvoker.execute(new CheckInCommand(hotel, date, 15, cliente));
		//hotel.addConsumo(date, 15, buscarProduto(30), 3);
		commandInvoker.execute(new AddConsumoCommand(hotel, date, 15, buscarProduto(30), 3));
		//hotel.addConsumo(date, 15, buscarProduto(50), 10);
		commandInvoker.execute(new AddConsumoCommand(hotel, date, 15, buscarProduto(50), 10));
		//double total = hotel.checkOut(date, 10, cliente);
		commandInvoker.execute(new CheckOutCommand(hotel, date, 10, cliente, observer));
		double total = observer.getTotal();
		//hotel.pagar(10, cliente, total);
		commandInvoker.execute(new PagarCommand(hotel, 10, cliente, total));
		
	}

	private static Produto buscarProduto(int i) {
		// metodo fake
		return new Produto();
	}

	private static Date converterData(String dataS) throws ParseException {
		return sdf.parse(dataS);
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static Cliente buscarCliente(int i) {
		// metodo fake
		return new Cliente();
	}

}
