package VisitorPattern.Challenge;

public class AdultTicket implements TicketElement{

    private int price = 10;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void accept(VisitorTicket visitorTicket) {
        visitorTicket.visit(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
