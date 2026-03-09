import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter College Name: ");
        String college = sc.nextLine();
        System.out.print("Enter Admin Key: ");
        String key = sc.nextLine();

        Management admin = new Management(college, key);
        System.out.println("Welcome to " + admin.collegeName + " Portal");

        while (true) {
            System.out.println("\n1. Create Student\n2. Update Student\n3. Delete Student\n4. List All\n5. Get Student By Name\n6. Get Student By ID\n7. get Student By Contact\n8. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Name: "); String n = sc.nextLine();
                    System.out.print("Contact: "); String c = sc.nextLine();
                    System.out.print("Year (YYYY): "); int y = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Regular/TFWS/DSY): "); String t = sc.nextLine();
                    
                    Student s = new Student(n, c, y, admin.totalEnrolled + 1, t);
                    admin.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Reg No to update: "); String regU = sc.nextLine();
                    System.out.print("New Contact: "); String conU = sc.nextLine();
                    admin.updateStudent(regU, conU);
                    break;

                case 3:
                    System.out.print("Enter Reg No to delete: "); String regD = sc.nextLine();
                    admin.deleteStudent(regD);
                    break;

                case 4:
                    admin.listAll();
                    break;

               	case 5:
           		    System.out.print("Enter Name to Search: ");
    	    	    String sName = sc.nextLine();
    		        admin.getStudentByName(sName);
    		        break;

		        case 6:
                    System.out.print("Enter ID (Reg No) to Search: ");
    		        String sID = sc.nextLine();
        		    admin.getStudentByID(sID);
    	    	    break;

	        	case 7:
    		        System.out.print("Enter Contact to Search: ");
    		        String sCon = sc.nextLine();
    		        admin.getStudentByContact(sCon);
    		        break;

         		case 8:
	        	    System.exit(0);

                    default:
                    System.out.println("Invalid choice. Try again.");
            }
        
        }
    
    }
   
}