package FactoryMethod;

public class TrainTicket implements Ticket{
    @Override
    public int getPrice() {
        return 7;
    }
}
