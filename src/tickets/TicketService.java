package tickets;

import tools.Formater;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicketService {
    // Method to get ticket objects by sector
    static ArrayList<Ticket> getTicketBySector(ArrayList<Ticket> ticketStorage, char sector) {
        ArrayList<Ticket> result = new ArrayList<>();

        for (Ticket ticket : ticketStorage) {
            if (ticket.getSector() == sector) {
                result.add(ticket);
            }
        }

        for (Ticket ticket : result) {
            System.out.println("ID: " + ticket.getId() + " => " + "Sector: " + ticket.getSector());
        }
        return result;
    }

    public static void main(String[] args) {

        Ticket emptyTicket = new Ticket();
        System.out.println("Empty Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(emptyTicket.getId()));

        Ticket limitedTicket = new Ticket().makeLimitedTicket("Tauron", 123);

        System.out.println("Limited Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(limitedTicket.getId()));
        System.out.println("Time: " + limitedTicket.getTime());

        Ticket regularTicket = new Ticket().makeRegularTicket("Some Hall", 345, true, 'a', 12.4f, 43.11f);
        Ticket regularTicket2 = new Ticket().makeRegularTicket("Any Hall", 346, true, 'B', 12.4f, 43.11f);

        //Checks
        System.out.println("Regular Ticket");
        System.out.println("Ticket id: " + Formater.idFormater(regularTicket.getId()));
        System.out.println("Backpack weight: " + (regularTicket.getBackpackWeight()));
        System.out.println("Promo Status: " + (regularTicket.getIsPromo()));
        System.out.println("Sector " + regularTicket.getSector());
        System.out.println("Concert hall: " + regularTicket.getConcertHall());
        System.out.println("Event code: " + regularTicket.getEventCode());
        System.out.println("Price: " + regularTicket.getPrice());
        System.out.println("Time: " + regularTicket.getTime());

        //check ticket storage
        System.out.println(Ticket.ticketStorage.get(0).getSector());
        System.out.println(Ticket.ticketStorage.get(1).getSector());
        System.out.println(Ticket.ticketStorage.get(2).getSector());

        //check that method to getting ticket by ID working
        getTicketBySector(Ticket.ticketStorage, 'A');
        getTicketBySector(Ticket.ticketStorage, 'B');
    }
}
