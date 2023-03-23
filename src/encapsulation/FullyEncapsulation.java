package encapsulation;

public class FullyEncapsulation {
    private String userName;
    private String passWord;
    private int activationCode;
    public long recoveryNumber;

    public FullyEncapsulation() {
    }

    public FullyEncapsulation(String userName, String passWord, int activationCode, long recoveryNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.activationCode = activationCode;
        this.recoveryNumber = recoveryNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setActivationCode(int activationCode) {
        this.activationCode = activationCode;
    }

    public void setRecoveryNumber(long recoveryNumber) {
        this.recoveryNumber = recoveryNumber;
    }

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
