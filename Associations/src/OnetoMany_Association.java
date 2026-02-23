import java.util.ArrayList;
import java.util.List;

class Project{
    private List<Issue> issues = new ArrayList<>();

    public void  addIssue(Issue issue){
        issues.add(issue);
        issue.setProject(this);
    }
}

class  Issue{
    private Project project;

    public void setProject(Project project) {
        this.project = project;
    }
}

public class OnetoMany_Association {
}
