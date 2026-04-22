import java.util.Scanner;

public class IterStringRep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter String 1:");
        String s1 = sc.nextLine();
	System.out.print("Enter String 2:");
        String s2 = sc.nextLine();
        
        IterStringRep2 SubS1 = new IterStringRep2();
        System.out.println(SubS1.logicBIterative(s1, s2));
        
        sc.close();
    }

    public int logicBIterative(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) {
            return 0;
        }

        int l1 = s1.length();
        int l2 = s2.length();
        int count = 0;

        for (int i = 0; i <= l1 - l2; i++) {
            if (s1.substring(i, i + l2).equals(s2)) {
                count++;
            }
        }
        return count;
    }
}