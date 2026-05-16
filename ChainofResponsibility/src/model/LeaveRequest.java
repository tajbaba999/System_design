package model;

public class LeaveRequest {
    private String employeeName;
    private int days;

     public LeaveRequest(String employeeName, int days){
        this.employeeName = employeeName;
        this.days = days;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public int getDays(){
        return days;
    }
}
