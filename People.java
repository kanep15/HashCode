import java.util.HashMap;
import java.util.Map;

public class People {
    private String name;
    private Map<String, Integer> skillLevels = new HashMap<>();

    public People(String name, Map map) {
        skillLevels = map;
        name = name;
    }
}
