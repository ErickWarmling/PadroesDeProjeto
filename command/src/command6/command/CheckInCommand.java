package command6.command;

import command6.Cliente;
import command6.Command;
import command6.Hotel;

import java.util.Date;

public class CheckInCommand implements Command {

    private Hotel hotel;
    private Date date;
    private int quarto;
    private Cliente cliente;

    public CheckInCommand(Hotel hotel, Date date, int quarto, Cliente cliente) {
        this.hotel = hotel;
        this.date = date;
        this.quarto = quarto;
        this.cliente = cliente;
    }

    @Override
    public void execute() {
        hotel.checkIn(date, quarto, cliente);
    }

    @Override
    public void undo() {

    }
}
