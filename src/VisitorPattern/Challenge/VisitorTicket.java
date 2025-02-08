package VisitorPattern.Challenge;

public interface VisitorTicket {
    void visit(AdultTicket adultTicket);
    void visit(GroupTicket groupTicket);

}
