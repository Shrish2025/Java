import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SpeedCheck app = new SpeedCheck();
        Scanner menuScanner = new Scanner(System.in);

        System.out.println("Welcome to the 2026 Typing Challenge.");
        
        while (true) {
            System.out.print("\nPick a string to type (1 or 2) or 0 to exit: ");
            int choice = menuScanner.nextInt();
            
            if (choice == 0) break;

            try {
                app.runTest(choice);
            } catch (FastTypistException e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
        }
    }
}
