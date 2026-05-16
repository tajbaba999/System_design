import handler.Director;
import handler.LeaveApprover;
import handler.Manager;
import handler.SeniorManager;
import model.LeaveRequest;

public class Main {
    public static void main(String[] args) {
        LeaveApprover manger = new Manager();
        LeaveApprover seniormager = new SeniorManager();
        LeaveApprover director = new Director();

        manger.setNextApprover(seniormager);
        seniormager.setNextApprover(director);

        LeaveRequest request1 = new LeaveRequest("Taj", 2);
        LeaveRequest request2 = new LeaveRequest("Nithin", 4);
        LeaveRequest request3 = new LeaveRequest("John", 7);
        LeaveRequest request4 = new LeaveRequest("Max", 13);

        manger.approveLeave(request1);
        manger.approveLeave(request2);
        manger.approveLeave(request3);
        manger.approveLeave(request4);
    }
}