package generics.generic;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> objectMap1=new HashMap<>();
        objectMap1.put("Name", "Faria Nawer");
        objectMap1.put("Department", "SQA");
        objectMap1.put("Company", "Brac IT");
        objectMap1.put("City", "Dhaka");
        System.out.println(objectMap1);
        System.out.println(objectMap1.get("Name"));


        Map<String, Object> objectMap2=new HashMap<>();
        objectMap2.put("Name", "Faria Nawer");
        objectMap2.put("Age", 23);
        objectMap2.put("Department", "SQA");
        objectMap2.put("Company", "Brac IT");
        objectMap2.put("Mobile", 01700110011);
        objectMap2.put("City", "Dhaka");
        objectMap2.put("objectMap1", objectMap1);
        System.out.println(objectMap2);

    }
}
