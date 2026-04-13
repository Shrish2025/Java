//Exception 3
import java.io.*;

class ExceptionHandling2{
  public static void main(String[] args){
      FileReader fr = new FileReader("ExceptionHandling2.java");
      System.out.println(fr);
      int[] p = new int[]{1, 2, 3, 0};
      System.out.println(p[p.length]);
      int a = 5;
      int b =0;
      int c = a/b;
      System.out.println(c);
      System.out.println("End of main");
      return;
    }
}
