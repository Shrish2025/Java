import java.util.Scanner;

public class RecurrStringRep1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Strings:");
	System.out.print("String  1:");
        String s1 = sc.nextLine();
	System.out.print("String 2:");
        String s2 = sc.nextLine();

        System.out.println(new RecurrStringRep1().logicARecursive(s1, s2));
        sc.close();
    }

    public int logicARecursive(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty()) return 0;

        // Local class to handle recursion internally
        class Resolver {
            int recurse(int i) {
                if (i > s1.length() - s2.length()) return 0;

                boolean isMatch = true;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }

                return (isMatch ? 1 : 0) + recurse(i + 1);
            }
        }

        return new Resolver().recurse(0);
    }
}