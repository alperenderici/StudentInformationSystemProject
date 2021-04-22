import java.util.*;


public class Student extends User implements Display {
    private String StudentName;
    private String StudentSurname;
    private String StudentNumber;
    private String StudentPassword;
    private String StudentPhoneNumber;
    private String StudentEmailAddress;
    private int StudentGrade;


    //Parameterized Constructor
    public Student(String studentName, String studentSurname, String studentNumber, String studentPassword, String studentPhoneNumber, String studentEmailAddress) {
        StudentName = studentName;
        StudentSurname = studentSurname;
        StudentNumber = studentNumber;
        StudentPassword = studentPassword;
        StudentPhoneNumber = studentPhoneNumber;
        StudentEmailAddress = studentEmailAddress;
        //StudentGrade = studentGrade;
    }



    //Setter-Getters
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSurname() {
        return StudentSurname;
    }
    public void setStudentSurname(String studentSurname) {
        StudentSurname = studentSurname;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }


    public String getStudentPassword(){
        return StudentPassword;
    }
    public void setStudentPassword(String studentPassword){
        StudentPassword = studentPassword;
    }

    public String getStudentPhoneNumber() {
        return StudentPhoneNumber;
    }
    public void setStudentPhoneNumber(String studentPhoneNumber) {
        StudentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentEmailAddress() {
        return StudentEmailAddress;
    }
    public void setStudentEmailAddress(String studentEmailAddress) {
        StudentEmailAddress = studentEmailAddress;
    }

    public int getStudentGrade() {
        return StudentGrade;
    }
    public void setStudentGrade(int studentGrade) {
        StudentGrade = studentGrade;
    }
//Setter-Getters



    @Override
    public void displayUser(){
        System.out.println("Student Name = "+getStudentName());
        System.out.println("Student Surname = "+getStudentSurname());
        System.out.println("Student Number = "+getStudentNumber());
        System.out.println("Student Password = "+getStudentPassword());
        System.out.println("Student Phone Number = "+getStudentPhoneNumber());
        System.out.println("Student E-mail Address = "+getStudentEmailAddress());
    }

    @Override
    public void update(){
        System.out.println("New Student Name = "+getStudentName());
        System.out.println("New Student Surname = "+getStudentSurname());
        System.out.println("New Student Number = "+getStudentNumber());
        System.out.println("New Student Password = "+getStudentPassword());
        System.out.println("New Student Phone Number = "+getStudentPhoneNumber());
        System.out.println("New Student E-mail Address = "+getStudentEmailAddress());
    }


}
