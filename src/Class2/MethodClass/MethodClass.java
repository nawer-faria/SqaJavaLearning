package Class2.MethodClass;

public class MethodClass {

    public String name;
    private int password;
    public int pin;

    public MethodClass(String name, int password, int pin) {
        this.name = name;
        this.password = password;
        this.pin = pin;
    }

    // Non-Return type method (non-parameterized)
    public void printInfo() {
        System.out.println("Name: " + name + " password: " + password + " PIN: " + pin);
    }

    // Return data type method (non-parameterized)
    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public int getPin() {
        return pin;
    }

    // Non-Return type method (parameterized)
    public void sum(int a, int b){
        System.out.println("SUM= " +(a+b));
    }

    // Return data type method (parameterized)
    public int square(int a){
        return a*a;
    }
}
