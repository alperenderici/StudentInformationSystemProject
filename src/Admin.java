import java.util.*;

public class Admin extends User implements Display {
    private String AdminUserName;
    private String AdminPassword;

    //Parameterized Constructor
    public Admin(String AdminUserName,String AdminPassword){
        this.AdminUserName = AdminUserName;
        this.AdminPassword = AdminPassword;
    }


    public String getAdminUserName() {
        return AdminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        AdminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }


    @Override
    public void displayUser(){
        System.out.println("Admin User Name = "+getAdminPassword());
        System.out.println("Admin Password = "+getAdminPassword());
    }

    @Override
    public void update(){
    }

}
