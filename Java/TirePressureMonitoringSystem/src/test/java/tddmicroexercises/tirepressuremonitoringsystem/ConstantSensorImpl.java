package tddmicroexercises.tirepressuremonitoringsystem;

public class ConstantSensorImpl implements Sensor {

    private final double psiValue;

    public ConstantSensorImpl(double psiValue) {
        this.psiValue = psiValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return psiValue;
    };

}
