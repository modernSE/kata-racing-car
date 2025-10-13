package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    private Check check;

    public Alarm(Check check){
        this.check = check;
    }

    boolean alarmOn = false;

    public void check()
    {
        if (check.exeedsRange())
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
