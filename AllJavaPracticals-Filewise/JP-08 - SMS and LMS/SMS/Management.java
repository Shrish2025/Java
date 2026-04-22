public class Management {
    public String collegeName;
    public String key;
    public Student[] enrollment = new Student[70];
    public int totalEnrolled = 0;
    public int maxIntake = 70;

    public Management(String college, String pass) {
        this.collegeName = college;
        this.key = pass;
    }

    // 1. Search by Name
    public void getStudentByName(String name) {
        boolean found = false;
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i].name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + enrollment[i].getRegNo() + " - " + enrollment[i].name);
                found = true;
            }
        }
        if (!found) System.out.println("No student found with name: " + name);
    }

    // 2. Search by ID (Registration Number)
    public void getStudentByID(String id) {
        boolean found = false;
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i].regNo.equalsIgnoreCase(id)) {
                System.out.println("Found Record: " + enrollment[i].getName() + " [" + enrollment[i].department + "]");
                found = true;
                break; // IDs are unique, so we can stop searching once found
            }
        }
        if (!found) System.out.println("No student found with ID: " + id);
    }

    // 3. Search by Contact
    public void getStudentByContact(String contact) {
        boolean found = false;
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i].contact.equals(contact)) {
                System.out.println("Found: " + enrollment[i].getName() + " (Reg: " + enrollment[i].regNo + ")");
                found = true;
            }
        }
        if (!found) System.out.println("No student found with contact: " + contact);
    }

    // --- Original methods below ---

    public void addStudent(Student s) {
        if (totalEnrolled < maxIntake) {
            enrollment[totalEnrolled] = s;
            totalEnrolled++;
            System.out.println("Student Added Successfully!");
        } else {
            System.out.println("Maximum intake reached!");
        }
    }

    public void updateStudent(String reg, String newContact) {
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i].regNo.equals(reg)) {
                enrollment[i].setContact(newContact);
                System.out.println("Contact Updated.");
                return;
            }
        }
    }

    public void deleteStudent(String reg) {
        for (int i = 0; i < totalEnrolled; i++) {
            if (enrollment[i].regNo.equals(reg)) {
                enrollment[i] = enrollment[totalEnrolled - 1]; 
                enrollment[totalEnrolled - 1] = null;
                totalEnrolled--;
                System.out.println("Student Deleted.");
                return;
            }
        }
    }

    public void listAll() {
        for (int i = 0; i < totalEnrolled; i++) {
            System.out.println(enrollment[i].getName() + " | " + enrollment[i].regNo + " | " + enrollment[i].contact);
        }
    }
}