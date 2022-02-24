import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private Map<String, Integer> skillLevels = new HashMap<>();

    public Person(String name, Map skills) {
        skillLevels = skills;
        name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkillLevels(Map<String, Integer> skillLevels) {
        this.skillLevels = skillLevels;
    }

    public void setSkillLevels(String skillName, int skillLevel) {
    }
}