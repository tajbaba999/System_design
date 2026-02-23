import java.util.ArrayList;
import java.util.List;

class Developer {
    private Team team;
    private String name;

    public Developer(String name){
        this.name = name;
    }

    public void setTeam(Team team){
        this.team = team;
    }

    public String getName(){
        return name;
    }

    public Team getTeam(){
        return  team;
    }
}

class Team {
    private String teamName;
    private List<Developer> developers = new ArrayList<>();

    public Team(String teamName){
        this.teamName = teamName;
    }

    public  void addDevloper(Developer dev){
        developers.add(dev);
        dev.setTeam(this); // maintain both sides
    }

    public String getTeamName(){
        return teamName;
    }

    public List<Developer> getDevelopers(){
        return developers;
    }
}

public class BidirectionalAssociation {
    public static void main(String[] args) {
        // Create a Team
        Team backendteam = new Team("Backend team");

        // Create Developers
        Developer dev1 = new Developer("Taj");
        Developer dev2 = new Developer("Rahul");

        // Add developers to team
        backendteam.addDevloper(dev1);
        backendteam.addDevloper(dev2);

        // Team knows Developers
        for(Developer dev : backendteam.getDevelopers()){
            // Developer also knows Team (bidirectional)
            System.out.println(dev.getName() +
                    " works in " + dev.getTeam().getTeamName());
        }
    }
}


