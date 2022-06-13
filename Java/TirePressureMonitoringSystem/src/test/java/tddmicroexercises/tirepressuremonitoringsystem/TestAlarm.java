package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import static org.junit.Assert.*;

public class TestAlarm {

    private Threshold threshold = new Threshold(17, 21);

    @Test
    public void ifIsBelowThreshold_setAlarm() {
        //PressureSensor sensor = new PressureSensor();
        var sensor = new TestPressureSensor(16);
        var checker = new PressureChecker(threshold);
        var alarm = new Alarm();

        var monitor = new TirePRessureMonitoringSystem(alarm, sensor, checker);
        monitor.check();
        assertEquals(true, !checker.isValid(sensor.popNextPressurePsiValue()));
    }

    @Test
    public void ifIsAboveThreshold_setAlarm() {
        var sensor = new TestPressureSensor(22);
        var checker = new PressureChecker(threshold);
        var alarm = new Alarm();

        var monitor = new TirePRessureMonitoringSystem(alarm, sensor, checker);
        monitor.check();
        assertEquals(true, !checker.isValid(sensor.popNextPressurePsiValue()));
    }

    @Test
    public void ifIsWithinThreshold_noAlarm() {
        var sensor = new TestPressureSensor(18);
        var checker = new PressureChecker(threshold);
        var alarm = new Alarm();

        var monitor = new TirePRessureMonitoringSystem(alarm, sensor, checker);
        monitor.check();

        assertEquals(false, alarm.isOn());
    }
}
