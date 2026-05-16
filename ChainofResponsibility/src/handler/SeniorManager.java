package handler;

import model.LeaveRequest;

public class SeniorManager extends LeaveApprover{
    @Override
    public void approveLeave(LeaveRequest request){
        if(request.getDays() <= 5){
            System.out.println("Senior Manger is approved your leave for " + request.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.approveLeave(request);
        }
    }
}
