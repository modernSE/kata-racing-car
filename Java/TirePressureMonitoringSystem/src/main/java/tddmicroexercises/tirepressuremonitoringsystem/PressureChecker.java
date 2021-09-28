package tddmicroexercises.tirepressuremonitoringsystem;

public class PressureChecker implements Checker<Double>{

    private Double low;
    private Double high;

    public PressureChecker(Double low, Double high){
        this.low = low;
        this.high = high;

    }

    public boolean check(Double value) {
        return value < low || high < value;
    }
}