package generics.generic;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class GenericSetTest {
    public static void main(String[] args) {
        //Parent variable object = new Child();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Lion");
        stringSet.add("Lion");
        stringSet.add("Tiger");
        stringSet.add("null");
        stringSet.add("Bear");
        stringSet.add("Bear");
        stringSet.add("null");
        stringSet.add("Monkey");
        stringSet.add("Zebra");

        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("=============================");
        stringSet.remove("Bear");
        stringSet.add("Giraffe");

        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("=============================");


    }
}
