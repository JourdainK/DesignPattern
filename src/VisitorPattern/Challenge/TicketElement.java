package VisitorPattern.Challenge;

public interface TicketElement {

    int getPrice();
    void accept(VisitorTicket visitorTicket);
}
