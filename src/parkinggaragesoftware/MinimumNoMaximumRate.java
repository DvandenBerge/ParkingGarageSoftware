package parkinggaragesoftware;

/**
 * @author Dan
 */
public class MinimumNoMaximumRate implements RateStrategy{
    private double minCharge=1.5;
    private double maxCharge=0;
    private double hourlyRate=.75;
    
    /**
     *
     * @return the base amount ($) charged to the customer
     */
    @Override
    public double getMinCharge(){   
        return minCharge;
    }
    @Override
    public void setMinCharge(double minCharge){
        if(minCharge>maxCharge || minCharge<0){
            throw new IllegalArgumentException();
        }
        this.minCharge=minCharge;
    }
    /**
     *
     * @return the MAXIMUM total of any bill
     */
    @Override
    public double getMaxCharge(){
        return maxCharge;
    }
    @Override
    public void setMaxCharge(double maxCharge){
        this.maxCharge=0;
    }

    /**
     *
     * @return The amount of money charged per hour
     */
    @Override
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    @Override
    public void setHourlyRate(double hourlyRate){
        if(hourlyRate<0){
            throw new IllegalArgumentException();
        }
        this.hourlyRate=hourlyRate;
    }
    
    /**
     *
     * @param time The number of hours spent in a parking garage
     * @return if the hourly rate and min charge is less than the max charge, the total cost is figured 
     * out with the formula, otherwise return the maxCharge
     */
    @Override
    public double getTotalCost(double time){
        //hours will be rounded up to the nearest integer
        int hours=(int)Math.round(time+0.5);
        return ((hours*hourlyRate)+minCharge);
    }
    
}
