import java.util.Scanner;

public class IterStringRep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1 = sc.nextLine();
	System.out.print("Enter String 2:");
        String s2 = sc.nextLine();
        
        IterStringRep3 ArrS1 = new IterStringRep3();
        System.out.println(ArrS1.logicCIterative(s1, s2));
        
        sc.close();
    }

    public int logicCIterative(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) {
            return 0;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int count = 0;

        for (int i = 0; i <= a1.length - a2.length; i++) {
            char[] d1 = s1.toCharArray(); 
            boolean possible = true;
            
            for (int j = 0; j < a2.length; j++) {
                d1[i + j] = a2[j]; 
                if (d1[i + j] != a1[i + j]) {
                    possible = false;
                    break;
                }
            }
            if (possible) count++;
        }
        return count;
    }
}