package handler;

import model.LeaveRequest;

public abstract class LeaveApprover {
    protected LeaveApprover nextApprover;
    public  void  setNextApprover(LeaveApprover nextApprover){
        this.nextApprover = nextApprover;
    }
    public abstract void  approveLeave(LeaveRequest request);
}
