package polymorphism;

public class ShoeParentClassOverride {
    String shoeType;
    String color;
    int size=8;
    String brandName="Adidus";
    int shoeId;

    public void jog(){
        int joggingTime=2;
        System.out.println("User can walk and run "+joggingTime+" times a day");
    }

    public void use(){
        System.out.println("Use Shoe to walk.");
    }
    public void displayShoeInfo(){
        System.out.println("Shoe Type is: " + shoeType);
        System.out.println("Shoe Color is: " + color);
        System.out.println("Shoe size is: " + size);
        System.out.println("Shoe Brand Name is: " + brandName);
        System.out.println("Shoe ID is: " + shoeId);
    }

    public static void main(String[] args) {
        ShoeParentClassOverride cades=new ShoeParentClassOverride();
        cades.shoeType="Cades";
        cades.color="Black";
        cades.shoeId=123455;
        cades.displayShoeInfo();
        cades.jog();
        cades.use();

    }
}
