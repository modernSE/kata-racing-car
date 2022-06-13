package tddmicroexercises.tirepressuremonitoringsystem;

public class Threshold {
    private double low;
    private double high;

    public Threshold(double low, double high) {
        this.low = low;
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public boolean isValidPressure(double pressure){
        return !(pressure < low || high < pressure);
    }
}
