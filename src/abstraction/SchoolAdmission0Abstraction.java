package abstraction;

public abstract class SchoolAdmission0Abstraction {
    String studentName;
    int studentAge;
    int admissionClass;
    String fatherOccupation;
    private int moneyReceiptNumber;

    public void setMoneyReceiptNumber(int moneyReceiptNumber) {
        this.moneyReceiptNumber = moneyReceiptNumber;
    }

    public int getMoneyReceiptNumber() {
        return moneyReceiptNumber;
    }

    public void printStudentInfo(){
        System.out.println("Student Name is: "+ studentName);
        System.out.println("Student Age is: "+ studentAge);
        System.out.println("Student want to get admitted to Class: "+ admissionClass);
        System.out.println("Student's Father Occupation is: "+ fatherOccupation);
        System.out.println("Money Receipt No. for Admission: "+ moneyReceiptNumber);
    }

}
