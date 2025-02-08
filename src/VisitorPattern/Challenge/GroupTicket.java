package VisitorPattern.Challenge;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement{
    private final List<TicketElement> elements = new ArrayList<>();

    @Override
    public int getPrice() {
        return elements.stream().mapToInt(TicketElement::getPrice).sum();
    }

    @Override
    public void accept(VisitorTicket visitorTicket) {
        visitorTicket.visit(this);
    }

    public void addElement(TicketElement element) {
        elements.add(element);
    }

    public List<TicketElement> getElements() {
        return elements;
    }
}
