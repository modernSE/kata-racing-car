package tddmicroexercises.tirepressuremonitoringsystem;

public class FakeConstantPressureSensor implements PressureSensor {

    private double constantPressure;

	@Override
	public double popNextPressurePsiValue() {
		return constantPressure;
	}

	public FakeConstantPressureSensor(double constantPressure) {
		this.constantPressure = constantPressure;
	}

    
}
