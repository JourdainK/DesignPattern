package FactoryMethod;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
        buyABusTicket();
        buyATrainTicket();
    }

    private static void buyABusTicket() {
        var ticket = ticketMachine.createTicket("Bus");
        System.out.println("Bus ticket price: " + ticket.getPrice());
        try{
            var ticket2 = ticketMachine.createTicket("Plane");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void buyATrainTicket() {
        var ticket = ticketMachine.createTicket("Train");
        System.out.println("Train ticket price: " + ticket.getPrice());
    }
}
