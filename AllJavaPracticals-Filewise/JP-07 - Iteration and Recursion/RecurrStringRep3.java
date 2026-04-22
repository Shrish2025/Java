import java.util.Scanner;

public class RecurrStringRep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1 = sc.nextLine();
	System.out.print("Enter String 2:");
        String s2 = sc.nextLine();
        
        System.out.println(new RecurrStringRep3().logicCRecursive(s1, s2));
        
        sc.close();
    }

    public int logicCRecursive(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) {
            return 0;
        }

        class Resolver {
            int recur(char[] a1, char[] a2, int i) {
                if (i > a1.length - a2.length) return 0;

                char[] d1 = new String(a1).toCharArray(); 
                boolean match = true;
                
                for (int j = 0; j < a2.length; j++) {
                    d1[i + j] = a2[j];
                    if (d1[i + j] != a1[i + j]) {
                        match = false;
                        break;
                    }
                }

                return (match ? 1 : 0) + recur(a1, a2, i + 1);
            }
        }

        return new Resolver().recur(s1.toCharArray(), s2.toCharArray(), 0);
    }
}