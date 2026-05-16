package handler;

import model.LeaveRequest;

public class Director extends LeaveApprover{
    @Override
    public void approveLeave(LeaveRequest request) {
        if (request.getDays() <= 10) {
            System.out.println("Director approve leave for " + request.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.approveLeave(request);
        }else {
            System.out.println("Leave request rejected.");
        }
    }
}
