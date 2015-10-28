package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class ParagraphFormat implements TicketFormatStrategy{

    @Override
    public String printBody(int number) {
        String body="";
        body+="Hello! Welcome to "+TicketFormatStrategy.garageName+"!";
        body+="Your ticket ID Number is "+number;
        body+="Insert this ticket into the gate at the end to finalize payment";
        return body;
    }
    
}
