package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAlarm {

    @Test
    public void foo() {
        var sensor = new ConstantSensorImpl(20);
        var checker = new CheckerImpl(17,21, sensor);
        Alarm alarm = new Alarm(checker);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }
}
