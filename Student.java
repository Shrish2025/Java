import java.util.Scanner;

public class Student {
    public String name;
    public String contact;
    public String regNo;
    public String department;

    public Student(String name, String contact, int year, int count, String type) {
        this.name = name;
        this.contact = contact;
        generateRegNo(year, count, type);
    }

    public void generateRegNo(int year, int count, String type) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Select Department
        System.out.println("Select Department: 1.IT 2.CS 3.CE 4.IS 5.EC");
        int deptChoice = sc.nextInt();
        
        String branchCode = "";
        switch (deptChoice) {
            case 1: branchCode = "IT"; break;
            case 2: branchCode = "CS"; break;
            case 3: branchCode = "CE"; break;
            case 4: branchCode = "IS"; break;
            case 5: branchCode = "EC"; break;
            default: branchCode = "XX";
        }
        this.department = branchCode;

        // 2. Select Degree Type
        System.out.println("Degree Type: 1. BTech (B) 2. MTech (M)");
        int degreeChoice = sc.nextInt();
        String degreeLetter = (degreeChoice == 2) ? "M" : "B";

        // 3. Determine Student Type Code
        String typeCode = "0"; // Regular
        if (type.equalsIgnoreCase("TFWS")) {
            typeCode = "1";
        } else if (type.equalsIgnoreCase("DSY")) {
            typeCode = "5";
        }

        // 4. Final Reg No Form: YYYY + D + BB + TypeCode + RN
        // Example: 2026BIT05 (Year 2026, BTech, IT, Regular, Student #5)
        this.regNo = year + degreeLetter + branchCode + typeCode + count;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getRegNo() { return regNo; }
    
    public void setContact(String newContact) {
        this.contact = newContact;
    }
}