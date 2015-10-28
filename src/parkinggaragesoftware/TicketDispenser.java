package parkinggaragesoftware;

/**
 * 
 * @author Dan
 */
public class TicketDispenser {
    
    private TicketFormatStrategy tfs;
    private static int ticketNumber=0;

    public TicketDispenser(TicketFormatStrategy tfs){
        this.tfs=tfs;
    }
    
    public void dispenseTicket(Car c){
        c.setTicket(formatTicket(3));
    }
    private Ticket formatTicket(double time){
        Ticket l=new Ticket(TicketFormatStrategy.garageName,time,tfs.printBody(++ticketNumber),ticketNumber);
        return l;
    }
        
    public TicketFormatStrategy getTFS() {
        return tfs;
    }
    public void setTfs(TicketFormatStrategy tfs) {
        if( tfs==null || (tfs instanceof TicketFormatStrategy) ){
            throw new IllegalArgumentException();
        }
        this.tfs = tfs;
    }
}
