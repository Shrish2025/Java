import java.util.Scanner;

public class RecurrStringRep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1 = sc.nextLine();
	System.out.print("Enter String 2:");
        String s2 = sc.nextLine();
        
        System.out.println(new RecurrStringRep2().logicBRecursive(s1, s2));
        //Implicitly created an object
        sc.close();
    }

    public int logicBRecursive(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length())
	{
            return 0;
        }

        class Resolver {
            int recurr(int i) {
                if (i > s1.length() - s2.length()) return 0;

                int Matched = s1.substring(i, i + s2.length()).equals(s2) ? 1 : 0;
                return Matched + recurr(i + 1);
            }
        }

        return new Resolver().recurr(0);
    }
}