import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Project {
    //Logging 5 10 5 1   // project // days taken to complete //score // best before //roles
    private String name;
    private int daysToComplete;
    private int score;
    private int bestBefore;
    private int numOfRoles;

    private Map<String, Integer> skillneeded = new HashMap<>();

    public Project(String name, Map skills) {
        skillneeded = skills;
        name = name;
    }

    public void setProjectSkills(Map<String, Integer> skillLevels) {
        this.skillneeded = skillLevels;
    }

    public Set<Map.Entry<String, Integer>> getProjectSkill() {
        return skillneeded.entrySet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(int daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    public int getNumOfRoles() {
        return numOfRoles;
    }

    public void setNumOfRoles(int numOfRoles) {
        this.numOfRoles = numOfRoles;
    }
    public int getSkilllevel(int skill){
        return skillneeded.get(skill);
    }
}