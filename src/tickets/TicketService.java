package tickets;

import tools.Formater;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
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



    public static Ticket getTicketById(int id){
        Ticket ticket = null;
        for (int i = 0; i < Ticket.ticketList.size(); i++) {
            if(Ticket.ticketList.get(i).getId() == id) {
                ticket = Ticket.ticketList.get(i);
                break;
            }
        }
        return ticket;
    }


    public static void main(String[] args) {



        Ticket emptyTicket = new Ticket();
        Ticket emptyTicket1 = new Ticket();
        Ticket emptyTicket2 = new Ticket();
        Ticket emptyTicket3 = new Ticket();
        Ticket emptyTicket4 = new Ticket();
        Ticket emptyTicket5 = new Ticket();
        Ticket emptyTicket6 = new Ticket();
        Ticket emptyTicket7 = new Ticket();
        Ticket emptyTicket8 = new Ticket();
        Ticket emptyTicket9 = new Ticket();
    }

}
