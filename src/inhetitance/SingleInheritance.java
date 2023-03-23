package inhetitance;

public class SingleInheritance extends NonLivingThings {
    public static void main(String[] args) {
        SingleInheritance monitor = new SingleInheritance();
        monitor.productName="HP";
        monitor.weightInKg=1.5F;
        monitor.productMaterial="Electronics";
        monitor.displayProductInfo();
        monitor.utility();
        monitor.growAndDevelop();


    }
}
