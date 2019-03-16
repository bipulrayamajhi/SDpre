import java.util.Scanner;
public class Objective3Lab3{
  public static void main(String [] args){
    int age=0, birthYear=0, currentYear= 2019;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    age = sc.nextInt();
    birthYear= currentYear- age;
    System.out.println("you were born in"+birthYear);
    sc.close();
  }
}
