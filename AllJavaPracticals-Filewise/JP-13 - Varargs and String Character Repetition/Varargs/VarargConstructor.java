//Simple Varargs

class VarargConstructor{
  VarargConstructor(int... i){
    int sum =0;
    for(int num : i){
      sum+=num;
    }
    System.out.println(sum);
  }
  public static void main(String[] args){
    new VarargConstructor(12, 1);
    new VarargConstructor(1, 2, 3);
    new VarargConstructor(1);
    new VarargConstructor();//zero parameter constructor is also valid
    return;
  }
}
