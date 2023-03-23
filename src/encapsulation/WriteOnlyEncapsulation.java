package encapsulation;

public class WriteOnlyEncapsulation {
    private String userName;
    private String passWord;
    private int activationCode;
    public long recoveryNumber;


    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("User Name " + userName);
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
        System.out.println("Password " + passWord);
    }

    public void setActivationCode(int activationCode) {
        this.activationCode = activationCode;
        System.out.println("Activation Code " + activationCode);
    }

    public void setRecoveryNumber(long recoveryNumber) {
        this.recoveryNumber = recoveryNumber;
        System.out.println("Recovery Number " + recoveryNumber);
    }

}
