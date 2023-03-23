package Class1;

public class VariablesConstructorMethods {
    String item, type;                // instance variable
    static String cuisine;            // static variable

    public VariablesConstructorMethods() {
        System.out.println("--------Lets Cook--------");
    }

    public void printCookingInfo() {
        // static variable use
        System.out.println("We are cooking " + cuisine);
        String howToCook = "Marinate the chicken. Then fry in Oil. Serve fresh and hot.";
        System.out.println("Cooking Instruction : " + howToCook);
        // local variable use
    }

    public void printInfo() {
        System.out.println("Cooking Item is " + item);
        System.out.println("Cooking type is " + type);
    }

    public static void main(String[] args) {
        VariablesConstructorMethods.cuisine = "CHINISE";
        VariablesConstructorMethods item1 = new VariablesConstructorMethods();
        item1.item = "Chicken";
        item1.type = "Fey";
        item1.printCookingInfo();
        item1.printInfo();
    }
}
