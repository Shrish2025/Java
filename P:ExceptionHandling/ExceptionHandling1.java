//Exception 2
class ExceptionHandling1{
  public static void main(String[] args){
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
