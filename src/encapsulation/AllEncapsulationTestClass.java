package encapsulation;

public class AllEncapsulationTestClass {
    public static void main(String[] args) {
        //Fully Encapsulation = Read+ Right
        FullyEncapsulation login1 = new FullyEncapsulation("Faria", "abc123$", 123456, 8801755882009L);
        System.out.println("User Name: " + login1.getUserName());
        System.out.println("User Password: " + login1.getPassWord());
        System.out.println("User Login Activation Code: " + login1.getActivationCode());
        System.out.println("Pass Word Recovery Number: " + login1.recoveryNumber);
        System.out.println("============================");

        //Fully Encapsulation = Read+ Write
        FullyEncapsulation login2 = new FullyEncapsulation();
        login2.setUserName("Mahu");
        login2.setPassWord("abc123$");
        login2.setActivationCode(123456);
        login2.setRecoveryNumber(8801765678965L);
        System.out.println("User Name: " + login2.getUserName());
        System.out.println("User Password: " + login2.getPassWord());
        System.out.println("User Login Activation Code: " + login2.getActivationCode());
        System.out.println("Pass Word Recovery Number: " + login2.recoveryNumber);
        System.out.println("============================");

        //Write Only Encapsulation
        WriteOnlyEncapsulation login3 = new WriteOnlyEncapsulation();
        login3.setUserName("Ehan");
        login3.setPassWord("abc123$");
        login3.setActivationCode(123456);
        login3.setRecoveryNumber(88017600008760L);
        System.out.println("============================");

        //Read Only Encapsulation
        ReadOnlyEncapsulation login4 = new ReadOnlyEncapsulation();
        System.out.println("User Name: " + login4.getUserName());
        System.out.println("User Password: " + login4.getPassWord());
        System.out.println("User Login Activation Code: " + login4.getActivationCode());
        System.out.println("Pass Word Recovery Number: " + login4.recoveryNumber);

    }
}
