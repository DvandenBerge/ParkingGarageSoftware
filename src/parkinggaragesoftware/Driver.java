package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class Driver {
    public static void main(String[] args) {
        
        TicketFormatStrategy tfs1=new ParagraphFormat();
        TicketDispenser td1=new TicketDispenser(tfs1);
        Car c1= new Car();
        RateStrategy minmax = new MinimumNoMaximumRate();
        TicketInputTerminal ti1=new TicketInputTerminal(minmax);
        GarageOwnerTerminal got=new GarageOwnerTerminal();
        
        got.addTerminal(ti1);
        
        //Start time is hard-coded to 3 in TicketDispenser
        td1.dispenseTicket(c1);
        ti1.enterTicket(c1.getTicket(), 8);
        got.getParkingReport();
        
        System.out.println("");
        
        td1.dispenseTicket(c1);
        ti1.enterTicket(c1.getTicket(), 5);  
        got.getParkingReport();
        
        System.out.println("");
        
        RateStrategy minNoMax=new MinimumMaximumRate();
        TicketInputTerminal ti2=new TicketInputTerminal(minNoMax);
        got.addTerminal(ti2);
        
        
        td1.dispenseTicket(c1);
        ti2.enterTicket(c1.getTicket(), 26);
        got.getParkingReport();
    }
}
