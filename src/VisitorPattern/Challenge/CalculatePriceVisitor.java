package VisitorPattern.Challenge;

import VisitorPattern.Visitor;

public class CalculatePriceVisitor implements VisitorTicket {


    @Override
    public void visit(AdultTicket adultTicket) {
        adultTicket.setPrice(5);
    }

    @Override
    public void visit(GroupTicket groupTicket) {
        groupTicket.getElements().forEach(e -> e.accept(this));
    }
}
