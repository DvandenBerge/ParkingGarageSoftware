package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public interface TicketFormatStrategy {
    public static String garageName="Best Value Parking Garage";
    public abstract String printBody(int number);
}
