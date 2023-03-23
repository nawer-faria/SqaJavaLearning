package generics.generic;

import java.util.ArrayList;
import java.util.List;

public class ListTestClass {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Orange");                                //insert/add value
        colorList.add("Green");
        colorList.add("Purple");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Blue");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Brown");
        colorList.add("Null");                                  //Null value
        colorList.add("Blue");                                  //Duplicate value

        for (String color : colorList) {                        // For Each Loop
            System.out.println("The color is: " + color);
        }

        System.out.println("================================");

        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(i + " no. color is  " + colorList.get(i));
        }
        System.out.println("================================");

        colorList.remove(4);                                //delete/remove value
        System.out.println(colorList.get(4));
        System.out.println("================================");

        colorList.add(2, "Navy Blue");              //Update/add value
        System.out.println(colorList.get(2));
        System.out.println("================================");

        System.out.println(colorList.get(0));                     //Search value
        System.out.println("================================");

        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(i + " no. color is  " + colorList.get(i));

        }
        System.out.println("================================");

        colorList.clear();                                      //Clears the List

    }

}

