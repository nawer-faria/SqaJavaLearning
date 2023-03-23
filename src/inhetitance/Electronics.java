package inhetitance;

public class Electronics extends NonLivingThings{

    String electronicsType;

    public void function() {
        System.out.println("Electronic gadgets make our life smart");
    }


        //Hierarchy Inheritance
    public static void main(String[] args) {
        Electronics mobile= new Electronics();
        mobile.productName="Furniture";
        mobile.electronicsType="Table";
        mobile.productMaterial="Wood";
        mobile.function();
        mobile.displayProductInfo();

    }


}
