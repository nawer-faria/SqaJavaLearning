package polymorphism;

public class ChildClassOverride extends ShoeParentClassOverride {

    @Override
    public void jog() {
        int joggingTime = 0;
        System.out.println("User can walk and run " + joggingTime + " times a day");
    }

    public static void main(String[] args) {
        ChildClassOverride hills = new ChildClassOverride();
        hills.shoeType = "Cades";
        hills.color = "Black";
        hills.shoeId = 123455;
        hills.displayShoeInfo();
        hills.jog();
        hills.use();

    }
}
