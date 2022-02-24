import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private Map<String, Integer> skillLevels = new HashMap<>();

    public Person(String name, Map map) {
        skillLevels = map;
        name = name;
    }
}
