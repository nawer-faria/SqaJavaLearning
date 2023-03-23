package generics.generic;

public class GenericTestClass {
    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>("Welcome to year ");
        System.out.print(stringGeneric.getObject());

        Generic<Integer> intGeneric = new Generic<>(2023);
        System.out.println(intGeneric.getObject());

    }
}
