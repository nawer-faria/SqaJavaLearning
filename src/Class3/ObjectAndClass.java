package Class3;

public class ObjectAndClass {
    String name;
    String color;
    boolean isSummerFruit;

    public ObjectAndClass() {
        System.out.println("Lets Create a Fruit");
    }

    public void printInfo() {
        System.out.println("Fruit Name is: " + name);
        System.out.println("Fruit Color is: " + color);
        System.out.println("This Fruit is Summer Fruit: " + isSummerFruit);
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        ObjectAndClass fruit1=new ObjectAndClass();
        fruit1.name="Mango";
        fruit1.color="Green";
        fruit1.isSummerFruit=true;
        fruit1.printInfo();

        ObjectAndClass fruit2=new ObjectAndClass();
        fruit2.name="Orange";
        fruit2.color="Orange";
        fruit2.isSummerFruit=false;
        fruit2.printInfo();
    }
}
