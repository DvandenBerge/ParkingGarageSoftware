package parkinggaragesoftware;

/**
 *
 * @author Dan
 */
public class MinimumMaximumRate implements RateStrategy{

    private double minCharge=2.0;
    private double maxCharge=10;
    private double hourlyRate=.5;
    
    @Override
    public double getMinCharge() {
        return minCharge;
    }
    @Override
    public void setMinCharge(double minCharge) {
        if(minCharge<0||minCharge>maxCharge){
            throw new IllegalArgumentException();
        }
        this.minCharge=minCharge;
    }
    
    @Override
    public double getMaxCharge() {
        return maxCharge;
    }
    @Override
    public void setMaxCharge(double maxCharge) {
        if(maxCharge>minCharge){
            throw new IllegalArgumentException();
        }
        this.maxCharge=maxCharge;
    }

    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }
    @Override
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<0){
            throw new IllegalArgumentException();
        }
        this.hourlyRate=hourlyRate;
    }   

    @Override
    public double getTotalCost(double time) {
       //hours is rounded up to the next integer
       int hours=(int)Math.round(time+0.5);
       return ((hours*hourlyRate)+minCharge)<maxCharge?((hours*hourlyRate)+minCharge):maxCharge;
    }
    
}
