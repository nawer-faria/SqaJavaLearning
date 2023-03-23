package Class3;

public class LoopStatements {
    public static void main(String[] args) {
        int n=5;
        //Java for loop: for(initialization, condition, increment)
        for (int a = 1; a <=n; ++a) {
            System.out.println(a +" :Class 3 Assignment is Submitted");
        }
        System.out.println("==================================");

        //Java for loop: for(initialization, condition, decrement)
        for (int a = 10; a >=n; --a) {
            System.out.println(a +" :Class 3 Assignment is Submitted");
        }
        System.out.println("==================================");

        //    Java for-each loop: for(data_type var : array_name/collection_name)
        String [] flowers={"Rose","Pitunia","Water Lily","Gardenia","daisy"};
        for(String printFlower:flowers){
            System.out.println("Flower Names: "+printFlower);
        }
        System.out.println("==================================");

        Double [] marks={56.7,78.1,70.9,79.0, 80.9,88.8,38.9};
        for(Double doubles:marks){
            System.out.println("Print Marks: "+doubles);
        }
        System.out.println("==================================");



        //    while loop: while(condition)
        int a=1;
        while(a <= n) {
            System.out.println(a +" :Class 3 Assignment is Submitted");
            a++;
        }
        System.out.println("==================================");

        //    do-while loop: do{} while (condition)
        int b=1;
        do {
            System.out.println(b +" :Class 3 Assignment is Submitted");
            b++;
        }while(b<10);



    }
}
