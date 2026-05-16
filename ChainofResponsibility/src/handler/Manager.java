package handler;

import model.LeaveRequest;

public class Manager extends LeaveApprover{

    @Override
    public void approveLeave(LeaveRequest request) {
        if(request.getDays() <= 2){
            System.out.println("Manager approved leave for " + request.getEmployeeName());
        }else if(nextApprover != null) {
            nextApprover.approveLeave(request);
        }
    }
}
