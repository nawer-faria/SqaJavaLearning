package generics.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedJsonHashMapTest {
    public static void main(String[] args) {
        List<String> sqaClass = new ArrayList<>();
        sqaClass.add("Class");
        sqaClass.add("Interface");
        sqaClass.add("Abstract Class");

        Map<String, Object> learning = new HashMap<>();
        learning.put("java", true);
        learning.put("selenium", false);
        learning.put("appium", "yes");

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("name", "John");
        objectMap.put("age", 22);
        objectMap.put("learning", learning);
        objectMap.put("sqaClass", sqaClass);
        System.out.println(objectMap);

    }
}
