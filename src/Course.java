import java.util.*;

public class Course {
    private String CourseID;
    private String CourseName;
    private String LecturerName;
    private String CourseCredit;
    private String CourseDepartment;
    private String ExamGrade;

    //Parameterized Constructor
    public Course(String courseID, String courseName, String lecturerName, String courseDepartment, String courseCredit) {
        CourseID = courseID;
        CourseName = courseName;
        LecturerName = lecturerName;
        CourseDepartment = courseDepartment;
        CourseCredit = courseCredit;
    }

    // Setter-Getter Start
    public String getCourseID() {
        return CourseID;
    }
    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getLecturerName() {
        return LecturerName;
    }
    public void setLecturerName(String lecturerName) {
        LecturerName = lecturerName;
    }

    public void setCourseDepartment(String courseDepartment) {
        CourseDepartment = courseDepartment;
    }
    public String getCourseDepartment() {
        return CourseDepartment;
    }

    public void setCourseCredit(String courseCredit) {
        CourseCredit = courseCredit;
    }
    public String getCourseCredit() {
        return CourseCredit;
    }

    public void setExamGrade(String examGrade) {
        ExamGrade = examGrade;
    }
    public String getExamGrade() {
        return ExamGrade;
    }
    //Setter-Getter End


    public void displayUser(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Course ID = "+getCourseID());
        System.out.println("Course Name = "+getCourseName());
        System.out.println("Lecturer Name = "+getLecturerName());
        System.out.println("Course credit: "+getCourseCredit());
        System.out.println("Department of the Course: "+getCourseDepartment());
        System.out.println("----------------------------------------------------------------");
    }


    public void ExamResult(){
    }
}

