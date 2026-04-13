//Exception 3
import java.io.*;

class ExceptionHandler{
  public static void main(String[] args){
      FileReader fr = null;
      try{
      fr = new FileReader("ExceptionHandling2.java");
      }
      catch(FileNotFoundException e){
      System.out.println("Exception 2  thrown");
      }System.out.println(fr);
      int[] p = new int[]{1, 2, 3, 0};
      try{System.out.println(p[p.length]);}
      catch(ArrayIndexOutOfBoundsException a){System.out.println(p[p.length - 1]);}
      int a = 5;
      int b =0;
      try{int c = a/b;}
      catch(ArithmeticException r){System.out.println(b);}
      System.out.println("End of main");
      return;
    }
}
