package Class2.Modifier1;

public class Modifiers {
    public String userName;
    private long password;
    protected int pin;
    boolean isAuthorized;

    public Modifiers() {

    }

    private void privateMethod() {
        System.out.println("Private Method is Called");
        System.out.println("Password: " + password);
    }

    void defaultMethod() {
        System.out.println("Default Method is Called");
        System.out.println("Person is Authorized: " + isAuthorized);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method is Called");
        System.out.println("PIN: " + pin);
    }

    public void publicMethod() {
        System.out.println("Public Method is Called");
        System.out.println("User Name: " + userName);
    }

    public static void main(String[] args) {
        Modifiers Object1 = new Modifiers();
        Object1.userName = "FARIA";
        Object1.password = 123456789101112L;
        Object1.pin = 1234;
        Object1.isAuthorized = true;
        Object1.privateMethod();
        Object1.defaultMethod();
        Object1.protectedMethod();
        Object1.publicMethod();
    }
}
