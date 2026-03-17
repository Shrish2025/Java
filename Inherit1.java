// Demonstrating Single Inheritance
import java.util.Scanner;

class Parent{
  String userName= "Shrish";
}
class SingleChild extends Parent{
  int userAge = 19;
  void User(){
    System.out.println("Age :"+ userAge);
  }
  public static void main(String[] args) {
    SingleChild sC = new SingleChild();
    System.out.println("User: " + sC.userName);
    sC.User(); 
  }
}
