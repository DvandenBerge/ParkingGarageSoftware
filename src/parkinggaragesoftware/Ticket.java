package parkinggaragesoftware;

/**
 * 
 * @author Dan
 */
public class Ticket {
    
    private String garageName;
    private double enterTime;
    private String body;
    private int ticketNumber;
    
    public Ticket(String name,double time,String body,int number){
        this.garageName=name;
        this.enterTime=time;
        this.ticketNumber=number;
    }

    public double getEnterTime() {
        return enterTime;
    }
    public void setEnterTime(double enterTime) {
        if(enterTime<0 || enterTime>23){
            throw new IllegalArgumentException();
        }
        this.enterTime = enterTime;
    }
    public int getElapsedHours(double time){
        return (int)( (Math.round( (time+0.5) )) -enterTime);
    }
    
    public String getGarageName() {
        return garageName;
    }
    public void setGarageName(String garageName) {
        if(garageName==null||garageName.length()==0){
            throw new IllegalArgumentException();
        }
        this.garageName = garageName;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        if(ticketNumber<0){
            throw new IllegalArgumentException();
        }
        this.ticketNumber = ticketNumber;
    }
    
}
