package encapsulation;

public class ReadOnlyEncapsulation {
    private String userName = "Khaled";
    private String passWord = "abc123$";
    private int activationCode = 123456;
    public long recoveryNumber = 8801755991007L;


    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getActivationCode() {
        return activationCode;
    }

    public long recoveryNumber() {
        return recoveryNumber;
    }
}
