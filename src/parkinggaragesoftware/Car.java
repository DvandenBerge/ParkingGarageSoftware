package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class Car {
    private Ticket pass;
    
    public void setTicket(Ticket p){
        this.pass=p;
    }
    public Ticket getTicket(){
        return pass;
    }
}
