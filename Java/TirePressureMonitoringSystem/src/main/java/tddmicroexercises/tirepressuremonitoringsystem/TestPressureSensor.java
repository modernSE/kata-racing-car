package tddmicroexercises.tirepressuremonitoringsystem;

public class TestPressureSensor implements Sensor {

    private double pressure;

    public TestPressureSensor(double pressure){
        this.pressure = pressure;

    }

    @Override
    public double popNextPressurePsiValue() {
      
        return pressure;
    }

}
