package command6.observer;

public class ConsoleObserver implements Observer {

    private double total;

    @Override
    public void checkOut(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
