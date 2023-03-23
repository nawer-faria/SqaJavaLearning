package Class3;

public class JumpStatements {
    public static void main(String[] args) {
        int i = 1;

        //Java break statement
        for (i = 1; i < 5; i++) {
            if (i == 3) break;
            System.out.println(i + " :Class 3 Assignment is Submitted");
        }
        System.out.println("==================================");

        //Java continue statement
        for (i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i + " :Class 3 Assignment is Submitted");
        }
        System.out.println("==================================");
    }
}
