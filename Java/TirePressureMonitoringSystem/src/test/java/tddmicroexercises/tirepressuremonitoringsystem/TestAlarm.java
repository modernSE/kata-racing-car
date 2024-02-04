package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAlarm {

    @Test
    public void belowThreshold() {
        var sensor = new FakeConstantPressureSensor(0);
        var pressureCheck = new TirePressureCheck(sensor, 1, 2);

        Alarm alarm = new Alarm(pressureCheck);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }

    @Test
    public void exceedsThreshold() {
        var sensor = new FakeConstantPressureSensor(3);
        var pressureCheck = new TirePressureCheck(sensor, 1, 2);

        Alarm alarm = new Alarm(pressureCheck);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }

    @Test
    public void withinRange() {
        var sensor = new FakeConstantPressureSensor(1.5);
        var pressureCheck = new TirePressureCheck(sensor, 1, 2);

        Alarm alarm = new Alarm(pressureCheck);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }
}
