import java.util.Scanner;

public class IterStringRep1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source String (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter Target String (s2): ");
        String s2 = sc.nextLine();

        int result = new IterStringRep1().logicAIterative(s1, s2);

        System.out.println("Total Repetitions Found: " + result);
        sc.close();
    }

    public int logicAIterative(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        
        if (l2 == 0 || l1 < l2) return 0;

        int count = 0;
        for (int i = 0; i <= l1 - l2; i++) {
            boolean match = true;
            for (int j = 0; j < l2; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }
}