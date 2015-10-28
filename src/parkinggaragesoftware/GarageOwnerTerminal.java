package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class GarageOwnerTerminal {
    private TicketInputTerminal[] terminals;
    
    public GarageOwnerTerminal(){
        this.terminals=new TicketInputTerminal[0];
    }
    
    public void getParkingReport(){
        int totalHours=0;
        double totalGrossed=0;
        for(TicketInputTerminal t:terminals){
            totalHours+=t.getTotalLoggedHours();
            totalGrossed+=t.getTotalGrossed();
        }
        System.out.println("Daily Report:");
        System.out.println("Total hours charged: "+totalHours);
        System.out.println("Total Collected: $"+totalGrossed);
    }
            
    public TicketInputTerminal[] getTerminals() {
        return terminals;
    }
    public void setTerminals(TicketInputTerminal[] terminals) {
        this.terminals = terminals;
    }
    
    public void addTerminal(TicketInputTerminal t){
        if(t==null || !(t instanceof TicketInputTerminal)){
            throw new IllegalArgumentException();
        }
        t=(TicketInputTerminal)t;
        TicketInputTerminal[] temp = new TicketInputTerminal[terminals.length+1];
        for(int i=0;i<terminals.length;i++){
            temp[i]=terminals[i];
        }
        terminals=temp;
        temp=null;
        terminals[terminals.length-1]=t;
    }
}
