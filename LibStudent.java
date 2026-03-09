import java.util.Scanner;

public class LibStudent {
    public String name;
    public String contact;
    public String regNo;
    public String department;
    public int booksTaken = 0;
    public int booksReturned = 0;

    public LibStudent(String name, String contact, int year, int count, String type) {
        this.name = name;
        this.contact = contact;
        generateRegNo(year, count, type);
    }

    public void generateRegNo(int year, int count, String type) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Department: 1.IT 2.CS 3.CE 4.IS 5.EC");
        int deptChoice = sc.nextInt();
        
        switch (deptChoice) {
            case 1: this.department = "IT"; break;
            case 2: this.department = "CS"; break;
            case 3: this.department = "CE"; break;
            case 4: this.department = "IS"; break;
            case 5: this.department = "EC"; break;
            default: this.department = "XX";
        }

        System.out.println("Degree Type: 1. BTech (B) 2. MTech (M)");
        String degreeLetter = (sc.nextInt() == 2) ? "M" : "B";

        String typeCode = "0"; // Regular
        if (type.equalsIgnoreCase("TFWS")) typeCode = "1";
        else if (type.equalsIgnoreCase("DSY")) typeCode = "5";

        this.regNo = year + degreeLetter + this.department + typeCode + count;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getRegNo() { return regNo; }
    public void setContact(String newContact) { this.contact = newContact; }
}