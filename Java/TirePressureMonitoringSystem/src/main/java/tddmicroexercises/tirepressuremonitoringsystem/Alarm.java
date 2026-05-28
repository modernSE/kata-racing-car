package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    Checker checker;
    boolean alarmOn = false;
    
    public Alarm(Checker checker) {
            this.checker = checker;
    }


    public void check()
    {
        if (checker.check())
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
