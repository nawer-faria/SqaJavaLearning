package Class2;

public class DataTypes {
    byte standard;
    short roll;
    int mark;
    long registrationNo;
    float cgpa;
    double mobile;
    char grade = 'B';
    boolean isPass;

    public DataTypes() {

    }

    public void printResult() {
        System.out.println("Student Result");
        System.out.println(standard + " " + roll + " " + mark + " " + registrationNo + " " + cgpa + " " + mobile + " " + grade + " " + isPass);
    }

    public static void main(String[] args) {
        DataTypes student = new DataTypes();
        student.standard = 10;
        student.roll = 102;
        student.mark = 680;
        student.registrationNo = 123456778970038L;
        student.cgpa = 3.5F;
        student.mobile = 01788660011D;
        student.grade = 'B';
        student.isPass = true;
        student.printResult();

    }


}

