package tddmicroexercises.tirepressuremonitoringsystem;

public class TirePressureCheck implements Check {

    private double min;
	private double max;
	private PressureSensor sensor;

	public TirePressureCheck(PressureSensor sensor, double min, double max){
		this.sensor = sensor;
		this.min = min;
		this.max = max;

    }

	@Override
	public boolean check() {
        
        var pressure = sensor.popNextPressurePsiValue();

        if (pressure < min)
            return false;
        if (pressure > max)
            return false;

		return true;
	}
    
}
