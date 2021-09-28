package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{

    private boolean alarmOn = false;
    private Sensor sensor;
    private Checker<Double> check;

    public Alarm(Sensor sensor, Checker<Double> check){
        this.sensor = sensor;
        this.check = check;
    }

    public void check()
    {
       boolean result = check.check(sensor.nextValue());
        if (result){
            alarmOn = result;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
