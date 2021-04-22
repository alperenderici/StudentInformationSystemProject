import java.util.*;

public class Lecturer extends User implements Display {
    private String LecturerName;
    private String LecturerSurname;
    private String LecturerID;
    private String LecturerPassword;
    private String LecturerCourseName;
    private String LecturerPhoneNumber;
    private String LecturerEmailAddress;

    //Parameterized Constructor
    public Lecturer(String lecturerName, String lecturerSurname, String lecturerID, String lecturerPassword,String lecturerCourseName, String lecturerPhoneNumber, String lecturerEmailAddress) {
        LecturerName = lecturerName;
        LecturerSurname = lecturerSurname;
        LecturerID = lecturerID;
        LecturerPassword = lecturerPassword;
        LecturerCourseName = lecturerCourseName;
        LecturerPhoneNumber = lecturerPhoneNumber;
        LecturerEmailAddress = lecturerEmailAddress;

    }


    public String getLecturerName() {
        return LecturerName;
    }

    public void setLecturerName(String lecturerName) {
        LecturerName = lecturerName;
    }

    public String getLecturerSurname() {
        return LecturerSurname;
    }

    public void setLecturerSurname(String lecturerSurname) {
        LecturerSurname = lecturerSurname;
    }

    public String getLecturerID() {
        return LecturerID;
    }

    public void setLecturerID(String lecturerID) {
        LecturerID = lecturerID;
    }
    public String getLecturerPassword(){
        return LecturerPassword;
    }
    public void setLecturerPassword(String lecturerPassword){
        LecturerPassword = lecturerPassword;
    }

    public String getLecturerCourseName() {
        return LecturerCourseName;
    }

    public void setLecturerCourseName(String lecturerCourseName) {
        LecturerCourseName = lecturerCourseName;
    }

    public String getLecturerPhoneNumber() {
        return LecturerPhoneNumber;
    }

    public void setLecturerPhoneNumber(String lecturerPhoneNumber) {
        LecturerPhoneNumber = lecturerPhoneNumber;
    }

    public String getLecturerEmailAddress(){
            return LecturerEmailAddress;
    }

    public void setLecturerEmailAddress(String lecturerEmailAdress) {
        LecturerEmailAddress = lecturerEmailAdress;
    }




    @Override
    public void displayUser(){
        System.out.println("Lecturer Name = "+getLecturerName());
        System.out.println("Lecturer Surname = "+getLecturerSurname());
        System.out.println("Lecturer ID = "+getLecturerID());
        System.out.println("Lecturer Password ="+getLecturerPassword());
        System.out.println("Lecturer Course Name = "+getLecturerCourseName());
        System.out.println("Lecturer Phone Number = "+getLecturerPhoneNumber());
        System.out.println("Lecturer E-mail Address = "+getLecturerEmailAddress());

    }
    @Override
    public void update(){
        System.out.println("New Lecturer Name = "+getLecturerName());
        System.out.println("New Lecturer Surname = "+getLecturerSurname());
        System.out.println("New Lecturer ID = "+getLecturerID());
        System.out.println("New Lecturer Password ="+getLecturerPassword());
        System.out.println("New Lecturer Course Name = "+getLecturerCourseName());
        System.out.println("New Lecturer Phone Number = "+getLecturerPhoneNumber());
        System.out.println("New Lecturer E-mail Address = "+getLecturerEmailAddress());

    }


}

