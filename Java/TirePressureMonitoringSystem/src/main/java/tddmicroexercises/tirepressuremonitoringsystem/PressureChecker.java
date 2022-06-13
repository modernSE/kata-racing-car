package tddmicroexercises.tirepressuremonitoringsystem;

public class PressureChecker
{    
    private Threshold threshold;

    public PressureChecker(Threshold threshold){
        this.threshold = threshold;
    }

    public boolean isValid(double psiPressureValue)
    {
        return threshold.isValidPressure(psiPressureValue);
    }

}
