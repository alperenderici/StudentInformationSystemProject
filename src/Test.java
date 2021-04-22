import java.util.*;

public class Test {

    private void StudentUpdateMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                               To change Student Name = 1                                |");
        System.out.println("|                            To change Student Surname = 2                                |");
        System.out.println("|                             To change Student Number = 3                                |");
        System.out.println("|                           To change Student Password = 4                                |");
        System.out.println("|                       To change Student Phone Number = 5                                |");
        System.out.println("|                     To change Student E-mail Address = 6                                |");
        System.out.println("|                              To change Student Grade = 7                                |");
        System.out.println("|                                   Please Press 0 to Exit                                |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void DisplayMenu() {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                           Display All Students Info = 1                                  |");
        System.out.println("|                                Display Student Info = 2                                  |");
        System.out.println("|                                 Display Course Info = 3                                  |");
        System.out.println("|                           Display All Course Grades = 4                                  |");
        System.out.println("|                              Display a Course Grade = 5                                  |");
        System.out.println("|                         Display All Lecturers' Info = 6                                  |");
        System.out.println("|                             Display a Lecturer Info = 7                                  |");
        System.out.println("|                                     Press 0 to Exit                                      |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void CreateMenu(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("|                                  Create Lecturer = 1                                   |");
        System.out.println("|                                  Create Student  = 2                                   |");
        System.out.println("|                                  Create Course   = 3                                   |");
        System.out.println("|                              Return Back to Menu = 0                                   |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void ChangeMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                              To change Student Course ID = 1                             |");
        System.out.println("|                            To change Student Course Name = 2                             |");
        System.out.println("|                          To change Student Lecturer Name = 3                             |");
        System.out.println("|                                Please Press 0 to Exit                                    |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void ChangeLecturer(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                              To change Lecturer Course Name = 1                         |");
        System.out.println("|                           To change Lecturer Course Surname = 2                         |");
        System.out.println("|                              To change Lecturer Lecturer ID = 3                         |");
        System.out.println("|                        To change Lecturer Lecturer Password = 4                         |");
        System.out.println("|                     To change Lecturer Lecturer Course Name = 5                         |");
        System.out.println("|                    To change Lecturer Lecturer Phone Number = 6                         |");
        System.out.println("|                  To change Lecturer Lecturer E-Mail Address = 7                         |");
        System.out.println("|                                 Please Press 0 to Exit                                  |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your Choice: ");
    }
    private void TeacherMainMenu(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("|                            Display All Student Info = 1                                |");
        System.out.println("|                                Display Student Info = 2                                |");
        System.out.println("|                                 Display Course Info = 3                                |");
        System.out.println("|                                 Update Student Info = 4                                |");
        System.out.println("|                                        Logout       = 5                                  |");
        System.out.println("|                                  Please Press 0 to Exit                                |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void StudentMainMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                                 Display All Courses = 1                                  |");
        System.out.println("|                                   Display a Course  = 2                                  |");
        System.out.println("|                                Display Course Grade = 3                                  |");
        System.out.println("|                                Display Announcement = 4                                  |");
        System.out.println("|                                 Return Back to Menu = 5                                  |");
        System.out.println("|                                     Press 0 to Exit                                      |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void AdminDStudentMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                             To Delete Student Name = 1                                  |");
        System.out.println("|                          To Delete Student Surname = 2                                  |");
        System.out.println("|                           To Delete Student Number = 3                                  |");
        System.out.println("|                         To Delete Student Password = 4                                  |");
        System.out.println("|                     To Delete Student Phone Number = 5                                  |");
        System.out.println("|                    To Delete Student E-mail Address = 6                                 |");
        System.out.println("|                             To Delete Student Grade = 7                                 |");
        System.out.println("|                                Please Press 0 to Exit                                   |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void AdminDCourseMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                                   To Delete Course Id = 1                               |");
        System.out.println("|                                 To Delete Course Name = 2                               |");
        System.out.println("|                             To Delete Course Lecturer = 3                               |");
        System.out.println("|                                Please Press 0 to Exit                                   |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void AdminDLecturerMenu(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|                              To Delete Lecturer Name = 1                                |");
        System.out.println("|                           To Delete Lecturer Surname = 2                                |");
        System.out.println("|                                To Delete Lecturer ID = 3                                |");
        System.out.println("|                          To Delete Lecturer Password = 4                                |");
        System.out.println("|                       To Delete Lecturer Course Name = 5                                |");
        System.out.println("|                      To Delete Lecturer Phone Number = 6                                |");
        System.out.println("|                            To Delete Lecturer E-Mail = 7                                |");
        System.out.println("|                               To Delete Lecture Name = 8                                |");
        System.out.println("|                                Please Press 0 to Exit                                   |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void AdminMainMenu(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("|                     Welcome Student Information System Admin Panel                     |");
        System.out.println("|                         Please enter your choice to menu below                         |");
        System.out.println("|                                        Create = 1                                      |"); //Bu bitti.
        System.out.println("|                                       Display = 2                                      |");
        System.out.println("|                                        Update = 3                                      |");
        System.out.println("|                                        Delete = 4                                      |");
        System.out.println("|                                  Announcement = 5                                      |");
        System.out.println("|                                   Return Back = 6                                      |");
        System.out.println("|                                   Press 0 to Exit                                      |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    private void MainMenu(){
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("|                              WELCOME STUDENT INFORMATION SYSTEM                               |");
        System.out.println("|                              Press 1 to access the admin panel                                |");
        System.out.println("|                             Press 2 to access the teacher panel                               |");
        System.out.println("|                             Press 3 to access the student panel                               |");
        System.out.println("|                                       Press 0 to exit                                         |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("                                          (\\__/) ||");
        System.out.println("                                          (•ㅅ•) ||");
        System.out.println("                                          / 　 づ");
    }


    public static void main(String[] args) {
        int choice;
        String tempName;
        String tempPassword;
        String tempID;
        boolean isAvailable;
        Message a = new Message(null,null,null);
        boolean Announce;
        String tempMessage;
        Scanner scan = new Scanner(System.in);



        //Users and courses we created
        Admin admin1 = new Admin("Admin", "123");

        Lecturer lecturer1 = new Lecturer("İlker", "Korkmaz", "101", "321", "SE-116", "100", "ilker.korkmaz@ieu.edu.tr");
        ArrayList<Lecturer> lecturerArrayList = new ArrayList<Lecturer>();
        lecturerArrayList.add(lecturer1);

        Student student1 = new Student("Fulya", "Koru", "100", "111", "123", "fulya.koru@ieu.edu.tr");
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(student1);

        Course course1 = new Course("116", "Introduction to Programming 2", "İlker Korkmaz", "Faculty of Engineering", "6");
        ArrayList<Course> courseArrayList = new ArrayList<Course>();
        courseArrayList.add(course1);

        Message announcement1 = new Message("User","123","" );
        ArrayList<Message> announcementArrayList = new ArrayList<Message>();
        announcementArrayList.add(announcement1);

        //End of the users and courses we created



        Test m = new Test();//to call the method
        // m.MainMenu(); // it calls the main method

        while (true) {
            //Main Panel
            boolean flag = false;
            m.MainMenu();
            choice = scan.nextInt();
            //End of the main panel


            if (choice == 1) {



                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("|                            Welcome to the admin login panel                            |");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("Username: ");
                tempName = scan.next();
                System.out.println();
                System.out.println("Password: ");
                tempPassword = scan.next();

                if (tempName.equals(admin1.getAdminUserName()) && tempPassword.equals(admin1.getAdminPassword())) {

                    while (true) {

                        if (flag)
                            break;
                        m.AdminMainMenu();
                        choice = scan.nextInt();


                        //CREATE PART
                        switch (choice) {//SWITCH 1
                            case 1://Create
                                m.CreateMenu();
                                choice = scan.nextInt();

                                while (choice != 0) {
                                    if (choice == 1) {//Create Lecturer
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        System.out.println("You are creating a new teacher. Please enter the information of the teacher");
                                        System.out.println("-Lecturer Name: ");
                                        String LecturerName = scan.next();
                                        System.out.println("-Lecturer Surname: ");
                                        String LecturerSurname = scan.next();
                                        System.out.println("-Lecturer ID: ");
                                        String LecturerID = scan.next();
                                        System.out.println("-Lecturer Password: ");
                                        String LecturerPassword = scan.next();
                                        System.out.println("-Name of the course that lecturer gives: ");
                                        String lecturerCourseName = scan.next();
                                        System.out.println("-Lecturers' Phone Number: ");
                                        String lecturerPhoneNumber = scan.next();
                                        System.out.println("-Lecturers' E-mail: ");
                                        String LecturerEmail = scan.next();
                                        Lecturer tempLecturer = new Lecturer(LecturerName, LecturerSurname, LecturerID, LecturerPassword, lecturerCourseName, lecturerPhoneNumber, LecturerEmail);
                                        lecturerArrayList.add(tempLecturer);
                                        System.out.println("Lecturer Created...");
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        tempLecturer.update();
                                        m.CreateMenu();
                                        choice = scan.nextInt();
                                    }
                                    if (choice == 2) {
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        System.out.println("You are creating a new student. Please enter the information of the student");
                                        System.out.println("Student Name: ");
                                        String StudentName = scan.next();
                                        System.out.println("Student Surname: ");
                                        String StudentSurname = scan.next();
                                        System.out.println("Student ID: ");
                                        String StudentID = scan.next();
                                        System.out.println("Student Password: ");
                                        String StudentPassword = scan.next();
                                        System.out.println("Student Phone Number: ");
                                        String studentPhoneNumber = scan.next();
                                        System.out.println("Student E-mail: ");
                                        String studentEmail = scan.next();

                                        Student tempStudent = new Student(StudentName, StudentSurname, StudentID, StudentPassword, studentPhoneNumber, studentEmail);
                                        studentArrayList.add(tempStudent);
                                        System.out.println("Student Created...");
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        tempStudent.update();
                                        m.CreateMenu();
                                        choice = scan.nextInt();
                                    }
                                    if (choice == 3) {
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        System.out.println("Course ID: ");
                                        String CourseID = scan.next();
                                        System.out.println("Course Name: ");
                                        String CourseName = scan.next();
                                        System.out.println("Course Lecturer: ");
                                        String CourseLecturerName = scan.next();
                                        System.out.println("Department of theCourse: ");
                                        String CourseDepartment = scan.next();
                                        System.out.println("Course Credit: ");
                                        String CourseCredit = scan.next();
                                        Course tempCourse = new Course(CourseID, CourseName, CourseLecturerName, CourseDepartment, CourseCredit);
                                        courseArrayList.add(tempCourse);
                                        System.out.println("Course Created...");
                                        System.out.println("------------------------------------------------------------------------------------------");
                                        tempCourse.displayUser();
                                        m.CreateMenu();
                                        choice = scan.nextInt();

                                    }
                                    if (choice >= 4 || choice != 0) {
                                        try { //TRY
                                            choice = Integer.parseInt(scan.nextLine());//Integer from User Input
                                        } //END TRY
                                        catch (Exception e) {//CATCH exception handling
                                            System.err.println("You entered a wrong number!");
                                            System.err.println("Please confirm your decision: ");
                                        }// END CATCH
                                    }
                                }
                                break;
                            // END OF THE CREATE PART
                            //START OF THE DISPLAY PART
                            case 2:
                                m.DisplayMenu();
                                choice = scan.nextInt();
                                while (choice != 0) {
                                    if (choice >= 8) {
                                        try { //TRY
                                            choice = Integer.parseInt(scan.nextLine());//Integer from User Input
                                        } //END TRY
                                        catch (Exception e) {//CATCH exception handling
                                            System.err.println("You entered a wrong number!");
                                            System.err.println("Please confirm your decision: ");
                                        }// END CATCH
                                    }
                                    switch (choice) {
                                        case 1: //Display Student Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                         Welcome to the Student Information Board                        |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < studentArrayList.size(); i++) {//Student Array size index checking
                                                studentArrayList.get(i).displayUser(); //Checks for Student
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;
                                        case 2:
                                            System.out.print("Please enter the ID of the Student you want to display info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Student studentSearch : studentArrayList) {
                                                scan.nextLine();
                                                if (studentSearch.getStudentNumber().equals(tempID)) {//Checks for equality
                                                    studentSearch.displayUser();
                                                    isAvailable = true;
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no student
                                                System.out.println("There is no Student available");
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;//End Display Student Info

                                        case 3: //Display Course Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                                Display Course Info Board                                |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                                courseArrayList.get(i).displayUser(); //Checks for Course
                                            }
                                            System.out.print("Please enter the ID of the Course you want to display info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Course courseSearch : courseArrayList) {
                                                if (courseSearch.getCourseID().equals(tempID)) {//Checks for equality
                                                    courseSearch.displayUser();
                                                    isAvailable = true;
                                                    m.DisplayMenu();
                                                    choice = scan.nextInt();
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no course0
                                                System.out.println("There is no Course available");
                                            }
                                            break;//Display Course Info End
                                        case 4://display grades
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                               Display Grades Info Board                                 |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                                courseArrayList.get(i).displayUser(); //Checks for Course
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;
                                        case 5:
                                            System.out.print("Please enter the ID of the Course you want to learn Exam Grade: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Course courseSearch : courseArrayList) {//End for
                                                scan.nextLine();
                                                if (courseSearch.getCourseID().equals(tempID)) {//If Checks for equality
                                                    courseSearch.displayUser();
                                                    isAvailable = true;
                                                    for (int i = 0; i < courseArrayList.size(); i++) {//bu for yanlış olursa üstteki forun altına yaz.
                                                        System.out.println(courseArrayList.get(i));
                                                        courseArrayList.get(i);
                                                    }
                                                }//If END
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;
                                        case 6://Display Lecturer Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                              Display Lecturer Info Board                                |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < lecturerArrayList.size(); i++) {//Lecturer Array size index checking
                                                lecturerArrayList.get(i).displayUser(); //Checks for Lecturer
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;
                                        case 7:
                                            System.out.print("Please enter the ID of the Lecturer you want to display info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Lecturer lecturerSearch : lecturerArrayList) {
                                                if (lecturerSearch.getLecturerID().equals(tempID)) {//Checks for equality
                                                    lecturerSearch.displayUser();
                                                    isAvailable = true;
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no Lecturer
                                                System.out.println("There is no Lecturer available");
                                            }
                                            m.DisplayMenu();
                                            choice = scan.nextInt();
                                            break;//End Display Lecturer Info
                                    }//Display  End
                                }
                                //Star of the Update
                            case 3:
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("|                                Update Student Info = 1                                  |"); //yerlestirdim
                                System.out.println("|                                 Update Course Info = 2                                  |"); //yerlestirdim
                                System.out.println("|                               Update Lecturer Info = 3                                  |"); //yerlestirdim
                                System.out.println("|                                Please Press 0 to Exit                                   |");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("Your choice: ");
                                choice = scan.nextInt();
                                while (choice != 0) {
                                    if (choice >= 8) {
                                        try { //TRY
                                            choice = Integer.parseInt(scan.nextLine());//Integer from User Input
                                        } //END TRY
                                        catch (Exception e) {//CATCH exception handling
                                            System.err.println("You entered a wrong number!");
                                            System.err.println("Please confirm your decision: ");
                                        }// END CATCH
                                    }
                                    //Update
                                    switch (choice) {//Update switch
                                        case 1://Update Student Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                                Update Student Info Board                               |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < studentArrayList.size(); i++) {//Student Array size index checking
                                                studentArrayList.get(i).displayUser(); //Checks for Student
                                            }
                                            System.out.print("Please enter the ID of the Student you want to update info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Student studentSearch : studentArrayList) {
                                                scan.nextLine();
                                                if (studentSearch.getStudentNumber().equals(tempID)) {//Checks for equality
                                                    studentSearch.displayUser();
                                                    m.StudentUpdateMenu();
                                                    choice = scan.nextInt();


                                                    switch (choice) {
                                                        case 1://Change Student Name
                                                            System.out.println("Type new Student Name");
                                                            String sName = scan.next();
                                                            studentSearch.setStudentName(sName);
                                                            System.out.println("Student Name Updated...");
                                                            studentSearch.update();
                                                            break;
                                                        case 2://Change Student Surname
                                                            System.out.println("Type new Student Surname");
                                                            String sSurname = scan.next();
                                                            studentSearch.setStudentSurname(sSurname);
                                                            System.out.println("Student Surname Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 3://Change Student Number
                                                            System.out.println("Type new Student Number");
                                                            String sNumber = scan.next();
                                                            studentSearch.setStudentNumber(sNumber);
                                                            System.out.println("Student Number Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 4://Change Student Password
                                                            System.out.println("Type new Student Password");
                                                            String sPassword = scan.next();
                                                            studentSearch.setStudentPassword(sPassword);
                                                            System.out.println("Student Password Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 5://Change Student Phone Number
                                                            System.out.println("Type new Student Phone Number");
                                                            String sPhoneNumber = scan.next();
                                                            studentSearch.setStudentPhoneNumber(sPhoneNumber);
                                                            System.out.println("Student Phone Number Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 6://Change Student E-mail Address
                                                            System.out.println("Type new Student E-mail Address");
                                                            String sMail = scan.next();
                                                            studentSearch.setStudentEmailAddress(sMail);
                                                            System.out.println("Student E-mail Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 7://Change Student Grade
                                                            System.out.println("Type new Student Grade");
                                                            int sGrade = scan.nextInt();
                                                            System.out.println("Student Grade Updated...");
                                                            studentSearch.update();
                                                            m.StudentUpdateMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                    }

                                                    isAvailable = true;
                                                    break;
                                                }
                                            }

                                            if (!isAvailable) { //If there is no student
                                                System.out.println("There is no Student available");
                                            }
                                            break;//End Update Student Info
                                        case 2://Update Course Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                                Course Student Info Board                                |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                                courseArrayList.get(i).displayUser(); //Checks for Course
                                            }
                                            System.out.print("Please enter the ID of the Course you want to update info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Course courseSearch : courseArrayList) {
                                                scan.next();
                                                if (courseSearch.getCourseID().equals(tempID)) {//Checks for equality
                                                    courseSearch.displayUser();
                                                    m.ChangeMenu();
                                                    choice = scan.nextInt();

                                                    switch (choice) {
                                                        case 1://Change Course ID
                                                            System.out.println("Please type new Course ID");
                                                            String cID = scan.next();
                                                            courseSearch.setCourseID(cID);
                                                            System.out.println("Student Course ID Updated...");
                                                            courseSearch.displayUser();
                                                            m.ChangeMenu();
                                                            break;

                                                        case 2://Change Course Name
                                                            System.out.println("Please type new Course Name");
                                                            String cName = scan.next();
                                                            courseSearch.setCourseID(cName);
                                                            System.out.println("Student Course Name Updated...");
                                                            courseSearch.displayUser();
                                                            m.ChangeMenu();
                                                            break;

                                                        case 3://Change Lecturer Name
                                                            System.out.println("Please type new Course Lecturer Name");
                                                            String cLecturerName = scan.next();
                                                            courseSearch.setCourseID(cLecturerName);
                                                            System.out.println("Student Course Lecturer name Updated...");
                                                            courseSearch.displayUser();
                                                            m.ChangeMenu();
                                                            break;
                                                    }

                                                    break;//Update End

                                                } else { //Wrong Enter
                                                    System.out.println("Your username or password is wrong...");
                                                    System.out.println("Please check and try again");
                                                    System.out.println();
                                                }
                                            }
                                        case 3://Update Lecturer Info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                                  Lecturer Update Board                                  |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < lecturerArrayList.size(); i++) {//Lecturer Array size index checking
                                                lecturerArrayList.get(i).displayUser(); //Checks for Lecturer
                                            }
                                            System.out.print("Please enter the ID of the Lecturer you want to update info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Lecturer lecturerSearch : lecturerArrayList) {
                                                scan.nextLine();
                                                if (lecturerSearch.getLecturerID().equals(tempID)) {//Checks for equality
                                                    lecturerSearch.displayUser();
                                                    m.ChangeLecturer(); //Lecturer main menu update
                                                    choice = scan.nextInt();

                                                    switch (choice) { // Lecturer Update Choices
                                                        case 1://Change Lecturer Name
                                                            System.out.println("Type new Lecturer Name");
                                                            String lName = scan.next();
                                                            lecturerSearch.setLecturerName(lName);
                                                            System.out.println("Lecturer Name Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 2://Change Lecturer Surname
                                                            System.out.println("Type new Lecturer Surname");
                                                            String lSurname = scan.next();
                                                            lecturerSearch.setLecturerSurname(lSurname);
                                                            System.out.println("Lecturer Surname Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 3://Change Lecturer ID
                                                            System.out.println("Type new Lecturer ID");
                                                            String lID = scan.next();
                                                            lecturerSearch.setLecturerID(lID);
                                                            System.out.println("Lecturer ID Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 4://Change Lecturer Password
                                                            System.out.println("Type new Lecturer Password");
                                                            String lPassword = scan.next();
                                                            lecturerSearch.setLecturerPassword(lPassword);
                                                            System.out.println("Lecturer Password Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 5://Change Lecturer Course Name
                                                            System.out.println("Type new Lecturer Course Name");
                                                            String lCourseName = scan.next();
                                                            lecturerSearch.setLecturerPassword(lCourseName);
                                                            System.out.println("Lecturer Name Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 6://Change Lecturer Phone Number
                                                            System.out.println("Type new Lecturer Phone Number");
                                                            String lPhoneNumber = scan.next();
                                                            lecturerSearch.setLecturerPhoneNumber(lPhoneNumber);
                                                            System.out.println("Lecturer Phone Number Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                        case 7://Change Lecturer E-mail
                                                            System.out.println("Type new Lecturer E-Mail Address");
                                                            String lEmail = scan.next();
                                                            lecturerSearch.setLecturerEmailAddress(lEmail);
                                                            System.out.println("Lecturer E-Mail Address Updated...");
                                                            lecturerSearch.update();
                                                            m.ChangeLecturer();
                                                            break;
                                                    }
                                                    isAvailable = true;
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no student
                                                System.out.println("There is no Lecturer available");
                                            }
                                            break;//End Update Lecturer Info ************
                                    }//Update switch End
                                }
                            case 4://Delete

                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("|                                Delete Student Info = 1                                  |");//ok
                                System.out.println("|                                 Delete Course Info = 2                                  |");//ok
                                System.out.println("|                               Delete Lecturer Info = 3                                  |");
                                System.out.println("|                                Please Press 0 to Exit                                   |");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("Your choice: ");
                                choice = scan.nextInt();

                                while (choice != 0) {
                                    switch (choice) {
                                        case 1://Delete Student Info
                                            System.out.println("Delete Student Info Board");
                                            for (int i = 0; i < studentArrayList.size(); i++) {//Student Array size index checking
                                                studentArrayList.get(i).displayUser(); //Checks for Student
                                            }
                                            System.out.print("Please enter the ID of the Student you want to delete info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Student studentSearch : studentArrayList) {
                                                scan.nextLine();
                                                if (studentSearch.getStudentNumber().equals(tempID)) {//Checks for equality
                                                    studentSearch.displayUser();
                                                    System.out.println();
                                                    m.AdminDStudentMenu();
                                                    choice = scan.nextInt();

                                                    switch (choice) {
                                                        case 1://To Delete Student Name
                                                            studentArrayList.remove(studentSearch.getStudentName());
                                                            System.out.println("Student Name Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 2://To Delete Student Surname
                                                            studentArrayList.remove(studentSearch.getStudentSurname());
                                                            System.out.println("Student Surname Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 3://To Delete Student Number
                                                            studentArrayList.remove(studentSearch.getStudentNumber());
                                                            System.out.println("Student Student Number Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 4://to Delete Student Password
                                                            studentArrayList.remove(studentSearch.getStudentPassword());
                                                            System.out.println("Student Password Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 5://To Delete Student Phone Number
                                                            studentArrayList.remove(studentSearch.getStudentPhoneNumber());
                                                            System.out.println("Student Phone Number Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 6://To Delete Student E-mail
                                                            studentArrayList.remove(studentSearch.getStudentEmailAddress());
                                                            System.out.println("Student E-mail Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 7://To Delete Student Grade
                                                            studentArrayList.remove(studentSearch.getStudentGrade());
                                                            System.out.println("Student Grade Deleted...");
                                                            studentSearch.update();
                                                            m.AdminDStudentMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                    }
                                                    isAvailable = true;
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no student
                                                System.out.println("There is no Student available");
                                            }

                                            break;

                                        case 2://delete course info
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                                Delete Course Info Board                                 |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < courseArrayList.size(); i++) {//course Array size index checking
                                                courseArrayList.get(i).displayUser(); //Checks for Course
                                            }
                                            System.out.print("Please enter the ID of the Course you want to delete info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Course courseSearch : courseArrayList) {
                                                scan.nextLine();
                                                if (courseSearch.getCourseID().equals(tempID)) {//Checks for equality
                                                    courseSearch.displayUser();
                                                    m.AdminDCourseMenu();
                                                    choice = scan.nextInt();
                                                    while (choice != 0) {
                                                        switch (choice) {
                                                            case 1: //To Delete Course Id
                                                                courseArrayList.remove(courseSearch.getCourseID());
                                                                System.out.println("Course ID Deleted...");
                                                                courseSearch.displayUser();
                                                                m.AdminDCourseMenu();
                                                                choice = scan.nextInt();
                                                                break;
                                                            case 2://To Delete Course Name
                                                                courseArrayList.remove(courseSearch.getCourseName());
                                                                System.out.println("Course Name Deleted...");
                                                                courseSearch.displayUser();
                                                                m.AdminDCourseMenu();
                                                                choice = scan.nextInt();
                                                                break;
                                                            case 3: //To Delete Course Lecturer
                                                                courseArrayList.remove(courseSearch.getLecturerName());
                                                                System.out.println("Student Course Lecturer Deleted...");
                                                                courseSearch.displayUser();
                                                                m.AdminDCourseMenu();
                                                                choice = scan.nextInt();
                                                                break;
                                                        }
                                                        isAvailable = true;
                                                        break;
                                                    }
                                                }
                                                if (!isAvailable) { //If there is no course
                                                    System.out.println("There is no Course available");
                                                }
                                                break;

                                            }
                                            break;

                                        case 3:
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            System.out.println("|                              Delete Lecturer Info Board                                 |");
                                            System.out.println("-------------------------------------------------------------------------------------------");
                                            for (int i = 0; i < lecturerArrayList.size(); i++) {//lecturer Array size index checking
                                                lecturerArrayList.get(i); //Checks for lecturer
                                            }
                                            System.out.print("Please enter the ID of the Lecturer you want to delete info: ");
                                            tempID = scan.next();

                                            isAvailable = false;
                                            for (Lecturer lecturerSearch : lecturerArrayList) {
                                                scan.nextLine();
                                                if (lecturerSearch.getLecturerID().equals(tempID)) {//Checks for equality
                                                    lecturerSearch.displayUser();
                                                    m.AdminDLecturerMenu();
                                                    choice = scan.nextInt();

                                                    switch (choice) {
                                                        case 1://To Delete Lecturer Name
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerName());
                                                            System.out.println("Lecturer Name Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 2://To Delete Lecturer Surname
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerSurname());
                                                            System.out.println("Course Surname Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 3://To Delete Lecturer ID
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerID());
                                                            System.out.println("Lecturer ID Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 4://To Delete Lecturer Password
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerPassword());
                                                            System.out.println("Lecturer Password Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 5://To Delete Lecturer Course Name
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerCourseName());
                                                            System.out.println("Lecturer Course Name Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 6://To Delete Lecturer Phone Number
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerPhoneNumber());
                                                            System.out.println("Lecturer Phone Number Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 7://To Delete Lecturer E-mail
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerEmailAddress());
                                                            System.out.println("Lecturer E-Mail Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                        case 8://To Delete Lecture name
                                                            lecturerArrayList.remove(lecturerSearch.getLecturerName());
                                                            System.out.println("Lecture Name Deleted...");
                                                            lecturerSearch.update();
                                                            m.AdminDLecturerMenu();
                                                            choice = scan.nextInt();
                                                            break;
                                                    }
                                                    isAvailable = true;
                                                    break;
                                                }
                                            }
                                            if (!isAvailable) { //If there is no lecturer
                                                System.out.println("There is no Lecturer available");
                                            }
                                            break;


                                    }
                                }
                            case 5:
                                while (choice != 0) {
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    System.out.println("Please Type your Announcement: ");
                                    tempMessage = scan.next();
                                    Message aMessage = new Message("", "","");
                                    announcementArrayList.add(aMessage);
                                    System.out.println("Your announcement is saved.");
                                    break;
                                }
                                break;
                            case 6:
                                System.out.println("Exiting...");
                                flag = true;
                                break;
                            default:
                                System.out.println("You Entered Wrong Choice");


                        }
                        if (flag)
                            break;
                    }

                }
            }
            else if (choice == 2) {

                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("|                           Welcome to the Teacher Login Panel                           |");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("Lecturer ID: ");
                tempName = scan.next();
                System.out.println();
                System.out.println("Password: ");
                tempPassword = scan.next();
                //Start of the info system if the id&pass correct

                if (tempName.equals(lecturer1.getLecturerID()) && tempPassword.equals(lecturer1.getLecturerPassword())) {//if 1.
                    while(true) {
                        if (flag)
                            break;
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("|                     Welcome Student Information System for Teachers                    |");
                        System.out.println("------------------------------------------------------------------------------------------");

                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("|                            Display All Student Info = 1                                |");
                        System.out.println("|                                Display Student Info = 2                                |");
                        System.out.println("|                                 Display Course Info = 3                                |");
                        System.out.println("|                                 Update Student Info = 4                                |");
                        System.out.println("|                                        Logout       = 5                                |");
                        System.out.println("|                                  Please Press 0 to Exit                                |");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("Your choice: ");
                        choice = scan.nextInt();

                        switch (choice) {//switch case
                            case 1://Display All Student Info
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("|                               Display Student Info Board                               |");
                                System.out.println("------------------------------------------------------------------------------------------");
                                for (int i = 0; i < studentArrayList.size(); i++) {//Student Array size index checking
                                    studentArrayList.get(i).displayUser(); //Checks for Student
                                }
                                break;
                            case 2://Display Student info
                                System.out.print("Please enter the ID of the Student you want to display info: ");
                                tempID = scan.next();

                                isAvailable = false;
                                for (Student studentSearch : studentArrayList) {
                                    scan.nextLine();
                                    if (studentSearch.getStudentNumber().equals(tempID)) {//Checks for equality
                                        studentSearch.displayUser();
                                        isAvailable = true;
                                        break;
                                    }
                                }
                                if (!isAvailable) { //If there is no student
                                    System.out.println("There is no Student available");
                                }
                                break;//End Display Student Info

                            case 3://Display Course Info
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("|                               Display Course Info Board                                |");
                                System.out.println("------------------------------------------------------------------------------------------");

                                for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                    courseArrayList.get(i).displayUser(); //Checks for Course
                                }
                                System.out.print("Please enter the ID of the Course you want to display info: ");
                                tempID = scan.next();

                                isAvailable = false;
                                for (Course courseSearch : courseArrayList) {
                                    if (courseSearch.getCourseID().equals(tempID)) {//Checks for equality
                                        courseSearch.displayUser();
                                        isAvailable = true;
                                        break;
                                    }
                                }
                                if (!isAvailable) { //If there is no course0
                                    System.out.println("There is no Course available");
                                }
                                break;//Display Course Info End

                            case 4://Update Student Info
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("|                               Update Student Info Board                                |");
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.print("Please enter the ID of the Student you want to update info: ");
                                tempID = scan.next();

                                isAvailable = false;
                                for (Student studentSearch : studentArrayList) {
                                    if (studentSearch.getStudentNumber().equals(tempID)) {//Checks for equality
                                        m.StudentUpdateMenu();
                                        choice = scan.nextInt();
                                        switch (choice) {
                                            case 1://Change Student Name
                                                System.out.println("Type new Student Name");
                                                String sName = scan.next();
                                                studentSearch.setStudentName(sName);
                                                System.out.println("Student Name Updated...");
                                                studentSearch.update();
                                                break;
                                            case 2://Change Student Surname
                                                System.out.println("Type new Student Surname");
                                                String sSurname = scan.next();
                                                studentSearch.setStudentSurname(sSurname);
                                                System.out.println("Student Surname Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;
                                            case 3://Change Student Number
                                                System.out.println("Type new Student Number");
                                                String sNumber = scan.next();
                                                studentSearch.setStudentNumber(sNumber);
                                                System.out.println("Student Number Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;
                                            case 4://Change Student Password
                                                System.out.println("Type new Student Password");
                                                String sPassword = scan.next();
                                                studentSearch.setStudentPassword(sPassword);
                                                System.out.println("Student Password Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;
                                            case 5://Change Student Phone Number
                                                System.out.println("Type new Student Phone Number");
                                                String sPhoneNumber = scan.next();
                                                studentSearch.setStudentPhoneNumber(sPhoneNumber);
                                                System.out.println("Student Phone Number Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;
                                            case 6://Change Student E-mail Address
                                                System.out.println("Type new Student E-mail Address");
                                                String sMail = scan.next();
                                                studentSearch.setStudentEmailAddress(sMail);
                                                System.out.println("Student E-mail Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;
                                            case 7://Change Student Grade
                                                System.out.println("Type new Student Grade");
                                                int sGrade = scan.nextInt();
                                                System.out.println("Student Grade Updated...");
                                                studentSearch.update();
                                                m.StudentUpdateMenu();
                                                choice = scan.nextInt();
                                                break;

                                        }
                                        isAvailable = true;
                                        break;
                                    }
                                }

                                if (!isAvailable) { //If there is no student
                                    System.out.println("There is no Student available");
                                }
                                break;//End Delete Lecturer Info ************
                            case 5:
                                flag = true;
                                break;
                            default:
                                System.out.println("You entered wrong input");

                                if (flag)
                                    break;

                        }//End Switch case


                    }
                } // END TEACHER
            }
            else if (choice == 3) {
                while (true) {

                    if (flag)
                        break;
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("|                           Welcome to the Student Login Panel                           |");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("Student ID: ");
                    tempName = scan.next();
                    System.out.println();
                    System.out.println("Password: ");
                    tempPassword = scan.next();

                    if (tempName.equals(student1.getStudentNumber()) && tempPassword.equals(student1.getStudentPassword())) {//
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("|                       Welcome to the Student Information System                        |");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println();
                        while (true) {
                            m.StudentMainMenu();
                            choice = scan.nextInt();
                            switch (choice) {//Switch
                                case 1://display courses
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    System.out.println("|                              Display Course Info Board                                 |");
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                        courseArrayList.get(i).displayUser(); //Checks for Course
                                    }//END FOR
                                    break;
                                case 2:
                                    System.out.print("Please enter the ID of the Course you want to display info: ");
                                    //tempID = scan.next();
                                    tempID = scan.next();
                                    isAvailable = false;
                                    for (Course courseSearch : courseArrayList) {//FOR
                                        scan.nextLine();
                                        if (courseSearch.getCourseID().equals(tempID)) {//Checks for equality
                                            courseSearch.displayUser();
                                            isAvailable = true;
                                            break;
                                        }//END IF
                                    }//END FOR
                                    if (!isAvailable) { //If there is no course
                                        System.out.println("There is no Course available");
                                    }
                                    break;
                                case 3://display grades
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    System.out.println("|                               Display Grades Info Board                                |");
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    for (int i = 0; i < courseArrayList.size(); i++) {//Course Array size index checking
                                        courseArrayList.get(i).displayUser(); //Checks for Course
                                    }
                                    System.out.print("Please enter the ID of the Course you want to learn Exam Grade: ");
                                    tempID = scan.next();

                                    isAvailable = false;
                                    for (Course courseSearch : courseArrayList) {//End for
                                        scan.nextLine();
                                        if (courseSearch.getCourseID().equals(tempID)) {//If Checks for equality
                                            courseSearch.displayUser();
                                            isAvailable = true;
                                            for (int i = 0; i < courseArrayList.size(); i++) {//bu for yanlış olursa üstteki forun altına yaz.
                                                System.out.println(courseArrayList.get(i));
                                                courseArrayList.get(i);
                                            }
                                        }//If END
                                        break;
                                    }//End for

                                    break;
                                //Announcement
                                case 4:
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    System.out.println("|                                    Display Announcement                                |");
                                    System.out.println("------------------------------------------------------------------------------------------");
                                    if(true) {
                                        for (int i = 0; i < announcementArrayList.size(); i++) {
                                            announcementArrayList.get(i).displayUser();
                                        }
                                    }
                                    else {
                                        System.out.println("There is not any Announcement to show.");
                                    }
                                    break;
                                case 5:
                                    flag = true;
                                    break;
                                case 0:
                                    System.exit(0);
                                default:
                                    System.out.println("You entered wrong choice");
                            }
                            if(flag)
                                break;

                        }
                    } else { //Wrong Enter
                        System.out.println("Your username or password is wrong...");
                        System.out.println("Please check and try again");
                        System.out.println();
                        break;
                    }
                }
            }

            else if (choice == 0)
                break;
            else
                System.out.println("You entered wrong choice");
        }

    }
}
