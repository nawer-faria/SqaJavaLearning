package polymorphism;

public class Overloading {
    String productName;
    String productType;
    float weightInKg;
    String shape;
    final int productionSerialCode = 12345677;

    public Overloading(){
        System.out.println(">>>>Lets Create a Product<<<<");
    }

    public void displayProductInfo(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Type: " + productType);
        System.out.println("Product Weight: " + weightInKg);
        System.out.println("Product Shape: " + shape);
        System.out.println("Production Serial code: " + productionSerialCode);
    }

    public void displayProductInfo(String productName, float weightInKg, String shape){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Weight: " + weightInKg);
        System.out.println("Product Shape: " + shape);
    }

    public void displayProductInfo(String productName, String productType, float weightInKg){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Type: " + productType);
        System.out.println("Product Weight: " + weightInKg);
    }

    public static void main(String[] args) {
        Overloading laptop=new Overloading();
        laptop.displayProductInfo("Laptop", "Electronics", 1.5F);
        System.out.println("===========================");

        Overloading bag=new Overloading();
        bag.productName="Bag";
        bag.productType="Leather Item";
        bag.shape="Rectangle";
        bag.weightInKg=0.5F;
        bag.displayProductInfo();
        System.out.println("===========================");

        Overloading chair=new Overloading();
        chair.displayProductInfo("Chair", 20, "Round");
    }
}
