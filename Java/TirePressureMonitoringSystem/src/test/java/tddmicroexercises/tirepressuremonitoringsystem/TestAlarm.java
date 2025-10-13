package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestAlarm {

    @RepeatedTest(100)
    public void noAlarm() {
        var check = new CheckMock(false);
        Alarm alarm = new Alarm(check);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }

      @RepeatedTest(100)
    public void alarm() {
        var check = new CheckMock(true);
        Alarm alarm = new Alarm(check);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }
}
