package tddmicroexercises.tirepressuremonitoringsystem;

public class CheckerImpl implements Checker {

    private final double LowPressureThreshold;
    public CheckerImpl(double lowPressureThreshold, double highPressureThreshold, Sensor sensor) {
        LowPressureThreshold = lowPressureThreshold;
        HighPressureThreshold = highPressureThreshold;
        this.sensor = sensor;
    }

    private final double HighPressureThreshold;
    
    private final Sensor sensor;

    @Override
    public boolean check()
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            return true;
        }
        return false;
    }

}
