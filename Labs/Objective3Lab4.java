import java.util.Scanner;
public class Objective3Lab4{
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("enter your first Name");
  String firstName = sc.next();
    System.out.println("enter your last Name");
    String lastName = sc.next();
    System.out.println("enter your age");
    int age = sc.nextInt();

    System.out.println("     firstName:   " + firstName     + "/t"+  "   lastName:   " +   lastName  +   "   age   "   + age);


sc.close();


}
}
