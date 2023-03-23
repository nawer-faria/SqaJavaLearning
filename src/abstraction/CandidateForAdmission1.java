package abstraction;

public class CandidateForAdmission1 extends SchoolAdmission0Abstraction {

    public static void main(String[] args) {

        // 0% Abstraction with implementation
        CandidateForAdmission1 student1 = new CandidateForAdmission1();
        student1.studentName="FARIA";
        student1.studentAge=12;
        student1.admissionClass=9;
        student1.fatherOccupation="Teacher";
        student1.setMoneyReceiptNumber(1234567);
        System.out.println("Money Receipt No. for Admission: "+student1.getMoneyReceiptNumber());
        student1.printStudentInfo();
    }
}
