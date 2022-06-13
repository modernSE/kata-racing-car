package tddmicroexercises.tirepressuremonitoringsystem;

public class TirePRessureMonitoringSystem {
    private TestPressureSensor sensor;
    private PressureChecker checker;
    private Alarm alarm;
    
    public TirePRessureMonitoringSystem(Alarm alarm, TestPressureSensor sensor, PressureChecker checker) {
        this.alarm = alarm;
        this.sensor = sensor;
        this.checker = checker;
    }

    
    public void check() {
       alarm.setOn(!checker.isValid(sensor.popNextPressurePsiValue()));
    }
}
