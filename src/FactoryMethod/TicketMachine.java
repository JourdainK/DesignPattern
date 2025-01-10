package FactoryMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    private static final Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();

    static {
        ticketMap.put("Bus", BusTicket::new);
        ticketMap.put("Train", TrainTicket::new);
    }

    Ticket createTicket(String ticketType) {
        if(ticketMap.containsKey(ticketType)) {
            return ticketMap.get(ticketType).get();
        } else {
            throw new IllegalArgumentException("Ticket type not found");
        }
    }
}
