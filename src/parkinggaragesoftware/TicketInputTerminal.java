package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class TicketInputTerminal {
    private RateStrategy rate;
    private int totalLoggedHours=0;
    private double totalGrossed=0;
    
    public TicketInputTerminal(RateStrategy rs){
        this.rate=rs;
    }
    
    public void enterTicket(Ticket p, int time){
        int totalHours=(p.getElapsedHours(time));
        double parkingCost=rate.getTotalCost(p.getElapsedHours(totalHours));
        displayCustomerOutput(totalHours,parkingCost,p.getGarageName(),p.getTicketNumber());
        totalLoggedHours+=totalHours;
        totalGrossed+=parkingCost;
    }
    
    private void displayCustomerOutput(int hours, double cost, String name, int ticketNumber){
        System.out.println("Thank you for parking at "+name);
        System.out.println("Ticket Number: "+ticketNumber);
        System.out.println("Total Time Parked: "+hours+" hours");
        System.out.println("Total amount owed: $"+cost);
        System.out.println("Please stop by again!");
    }
    
    public double getTotalGrossed(){
        return totalGrossed;
    }
    public double getTotalLoggedHours(){
        return totalLoggedHours;
    }
         
}
