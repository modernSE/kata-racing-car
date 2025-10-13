package tddmicroexercises.tirepressuremonitoringsystem;

public class CheckMock implements Check {

    private boolean checkResult;

    public CheckMock(boolean checkResult){
        this.checkResult = checkResult;}

    @Override
    public boolean exeedsRange() {
        return checkResult;
    }

}
