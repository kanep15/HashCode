import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;
    private Map<String, Integer> skillLevels;

    public Person(String name, Map skills) {
        skills = skillLevels;
        name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkillLevels(HashMap<String, Integer> skillLevels) {
        this.skillLevels = skillLevels;
    }



    public String getName() {
        return name;
    }
    public Set<Map.Entry<String, Integer>> getSkill() {
        return skillLevels.entrySet();
    }

}