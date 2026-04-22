import java.util.Scanner;

public class LMS {
    public static LibStudent[] enrollment = new LibStudent[70];
    public static int totalEnrolled = 0;

    // FIXED: Changed from void to LibStudent to solve your compiler error
    public static LibStudent getStudentByID(String id) {
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i] != null && enrollment[i].regNo.equalsIgnoreCase(id)) {
                return enrollment[i]; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n--- LMS MENU ---\n1. Create Student\n2. Add Books\n3. Issue Book\n4. Return Book\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    if (totalEnrolled < 70) {
                        System.out.print("Name: "); String n = sc.nextLine();
                        System.out.print("Contact: "); String c = sc.nextLine();
                        System.out.print("Year (YYYY): "); int y = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Type (Regular/TFWS/DSY): "); String t = sc.nextLine();
                        enrollment[totalEnrolled] = new LibStudent(n, c, y, totalEnrolled + 1, t);
                        totalEnrolled++;
                    }
                    break;
		        case 2:
                    System.out.println("Enter Book details :");
                    System.out.print("Year of Publishing :"); 
                    String p = sc.nextLine();
                    System.out.print("Title of book :"); 
                    String k = sc.nextLine(); int f = (int)k.charAt(0)-64;
                    int w = k.trim().isEmpty() ? 0 : k.trim().split("\\s+").length;
                    System.out.print("Enter the book edition :");
                    int bE = sc.nextInt(); sc.nextLine();
                    System.out.print("Item Number :");
                    int item = sc.nextInt(); sc.nextLine(); 
                    Book myBook = new Book(p, f, w, bE, item);
                    break;
                case 3:
                    System.out.print("Enter Student Reg No: ");
                    String sid = sc.nextLine();
                    LibStudent s = getStudentByID(sid);
                    if (s != null) {
                        System.out.print("Enter Barcode: ");
                        String bc = sc.nextLine();
                        lib.issueBook(bc, s);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student Reg No: ");
                    String rid = sc.nextLine();
                    LibStudent rs = getStudentByID(rid);
                    if (rs != null) {
                        System.out.print("Enter Barcode: ");
                        String rbc = sc.nextLine();
                        lib.returnBook(rbc, rs);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
            sc.close();
        }
    }
}