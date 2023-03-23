package Class3;

public class Constructors {
    String productName;
    boolean withSugar;
    int weight;
    String type;

    public Constructors() {
        //   No-arg/default constructor.
    }

    //   Parameterized constructor.
    public Constructors(String productName, boolean withSugar, int weight, String type) {
        this.productName = productName;
        this.withSugar = withSugar;
        this.weight = weight;
        this.type = type;
    }

    //   Parameterized constructor.
    public Constructors(String productName, int weight, String type) {
        this.productName = productName;
        this.weight = weight;
        this.type = type;
    }

    public void printInfo(){
        System.out.println("Product Information: "+productName+" "+withSugar+" "+weight+" "+type);
        System.out.println("=======================================================================");
    }

    public static void main(String[] args) {
        Constructors bread=new Constructors();
        bread.productName="Bread";
        bread.withSugar=true;
        bread.weight=500;
        bread.type="Brown Bread";
        bread.printInfo();

        Constructors bun=new Constructors("Bun", false, 100, "White Bread");
        bun.printInfo();

        Constructors creamRoll=new Constructors("Cream Roll", 200, "Brown Bread");
        creamRoll.printInfo();
    }

}
