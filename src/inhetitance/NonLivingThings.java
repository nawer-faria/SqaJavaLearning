package inhetitance;

public class NonLivingThings {
    String productName;
    float weightInKg;
    String productMaterial;
    final String shape = "Rectangle";
    private int productId;


    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Weight: " + weightInKg);
        System.out.println("Product Material: " + productMaterial);
        System.out.println("Product Shape: " + shape);
    }

    public void utility() {
        System.out.println("Non-Living-Things are used to improve life ");
    }

    public void growAndDevelop() {
        System.out.println("Non-Living-Things dont grow and develop");
    }


}
