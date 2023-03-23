package Class3;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int age = 30;

        // if statement
        if (age > 18) {
            System.out.println("Person is Adult");
            System.out.println("==================");
        }

        // if-else statement
        if (age >= 18) {
            System.out.println("Person is Adult");
        } else {
            System.out.println("Person is not an Adult");
        }
        System.out.println("==================");

        //if-else-if ladder
        if (age >= 1 && age <= 2) {
            System.out.println("Person is an Infant");
        } else if (age >= 3 && age <= 4) {
            System.out.println("Person is a Toddler");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Person is a Grown Up baby");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Person is at Teenage");
        } else if (age >= 18 && age >= 50) {
            System.out.println("Person is an Adult");
        } else {
            System.out.println("Person is Old");
        }
        System.out.println("==================");

        //Nested if-statement
        if (age >= 18 && age <= 50) {
            if (age <= 30) {
                System.out.println("Person is an Young");
            } else {
                System.out.println("Person's Age= " + age);
            }
        }
    }
}
