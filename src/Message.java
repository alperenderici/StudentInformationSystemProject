import java.util.*;

public class Message extends Admin {
    private String Announcement;


    //Parameterized Constructor
    public Message(String AdminUserName, String AdminPassword, String announcement) {
        super(AdminUserName, AdminPassword);
        this.Announcement = announcement;
    }

    public String getAnnouncement() {
        return Announcement;
    }

    public void setAnnouncement(String announcement) {
        this.Announcement = announcement;
    }


    @Override
    public void displayUser(){
        System.out.println("You have a massage from: "+getAdminUserName());
        System.out.println("Message: "+getAnnouncement());
    }

    @Override
    public void update(){
        System.out.println("You have a massage from: "+getAdminUserName());
        System.out.println("Message: "+getAnnouncement());
    }
}

