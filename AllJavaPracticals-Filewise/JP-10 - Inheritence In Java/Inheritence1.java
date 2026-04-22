class Calc{
    public int sum(int a, int b){
        return a+b;
    }
    public int differ(int a, int b){
        return a-b;
    }
}

public class Inheritence1 extends Calc{
    public static void main(String[] args){
        Inheritence1 i = new Inheritence1();
        System.out.println(i.sum(10,20));
        System.out.println(i.differ(14, 2));
        return;
    }    
}
