import java.util.HashMap;
import java.util.Map;

public class People {
    private String name;
    private Map<String, Integer> skills = new HashMap<>();

    public People(String name, Map map) {
        skills = map;
        name = name;
    }

    public void updateSkills() {

    }
}
