package Class2.Modifier2;

import Class2.Modifier1.Modifiers;

public class Modifier2TestClass {
    public static void main(String[] args) {
        Modifiers Object1 = new Modifiers();
        Object1.userName = "FARIA";
        //Object1.password = 123456789101112L;
        //Object1.pin = 1234;
        //Object1.isAuthorized = true;
        //Object1.privateMethod();
        //Object1.defaultMethod();
        //Object1.protectedMethod();
        Object1.publicMethod();
    }
}
