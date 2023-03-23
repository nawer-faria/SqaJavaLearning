package generics.non;

public class NonGenericTestClass {
    public static void main(StringTest[] args) {
        IntegerTest integer1 = new IntegerTest(123);
        System.out.println(integer1.getNumber());

        DoubleTest double1=new DoubleTest(1234.567);
        System.out.println(double1.getNumber());

        StringTest string1=new StringTest("Good");
        System.out.println(string1.getString());




    }
}
