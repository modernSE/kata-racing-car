package tddmicroexercises.tirepressuremonitoringsystem;

public class SensorCheck implements Check {

    
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;
    private Sensor sensor;

    public SensorCheck(Sensor sensor){
        this.sensor = sensor;
    }


    @Override
    public boolean exeedsRange() {
        double psiPressureValue = sensor.popNextValue();
        return psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue;
    }

}
