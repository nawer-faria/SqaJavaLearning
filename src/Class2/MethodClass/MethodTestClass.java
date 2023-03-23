package Class2.MethodClass;

public class MethodTestClass {
    public static void main(String[] args) {
        MethodClass methodClass=new MethodClass("FARIA",12345678, 7009);
        methodClass.printInfo();
        System.out.println("Age: " +methodClass.getName());
        System.out.println("Password: " +methodClass.getPassword());
        System.out.println("PIN: " + methodClass.getPin());
        methodClass.sum(12,6);
        System.out.println("Square of a is = " + methodClass.square(11));

    }
}
