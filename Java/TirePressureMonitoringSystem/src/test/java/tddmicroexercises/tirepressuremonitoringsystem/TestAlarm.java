package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAlarm {

    @Test
    public void foo() {
        Alarm alarm = new Alarm();
        // alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }
}
