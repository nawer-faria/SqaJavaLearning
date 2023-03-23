package convension;

public class JavaNamingConvention {
    String studentName;
    int studentRoll;
    String gender;
    int mobileNumber;
    final int SCHOOL_CODE = 2003;

    public JavaNamingConvention() {

    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No.: " + studentRoll);
        System.out.println("Gender: " + gender);
        System.out.println("Student's Mobile number: " + mobileNumber);
        System.out.println("School Code: " + SCHOOL_CODE);
    }

    public void studentDuty() {
        System.out.println("Student Should Study Hard");
    }

    public void sleep(){
        System.out.println("Student should sleep");
    }

    public static void main(String[] args) {
        JavaNamingConvention student1 = new JavaNamingConvention();
        student1.studentName = "Faria Nawer";
        student1.studentRoll = 123;
        student1.gender = "Female";
        student1.mobileNumber=178877998;
        student1.displayStudentInfo();
        student1.studentDuty();
        student1.sleep();

    }


}
