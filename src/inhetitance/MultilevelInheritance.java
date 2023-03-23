package inhetitance;

public class MultilevelInheritance extends Furniture {

    public void useInheritance() {
        System.out.println("Use Inheritance to inherit parent's properties");
    }
    public static void main(String[] args) {
        MultilevelInheritance table = new MultilevelInheritance();
        table.productName="Furniture";
        table.furnitureType="Table";
        table.productMaterial="Wood";
        table.weightInKg=5;
        table.function();
        table.useInheritance();
        table.displayProductInfo();

    }



}
