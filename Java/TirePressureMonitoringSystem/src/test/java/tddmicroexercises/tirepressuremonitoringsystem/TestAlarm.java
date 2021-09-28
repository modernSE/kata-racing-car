package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import static org.junit.Assert.*;

public class TestAlarm {
    final double LowPressureThreshold = 17;
    final double HighPressureThreshold = 21;

    @Test
    public void testAlarmIfInTreshhold() {
        Sensor sensor = new SensorMock(5.0);
        Checker<Double> check = new PressureChecker(1.0, 5.0);
        Alarm alarm = new Alarm(sensor, check);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }
    public class CheckerMock implements Checker<Double>{

        @Override
        public boolean check(Double value) {
            return false;
        }
    }
    public class SensorMock implements Sensor {

        private Double value;
        public SensorMock(Double value){
            this.value = value;}
        @Override
        public double nextValue() {
            return value;
        }}

    @Test
    public void checkBelowThreshold() {
        Checker<Double> check = new PressureChecker(1.0, 5.0);
        
        assertEquals(false, check.check(0.0));
    }
    @Test
    public void checkWithinThresholds() {
        Checker<Double> check = new PressureChecker(1.0, 5.0);
        
        assertEquals(true, check.check(2.0));
    }
    @Test
    public void checkAboveThreshold() {
        Checker<Double> check = new PressureChecker(1.0, 5.0);
        
        assertEquals(false, check.check(6.0));
    }


}
