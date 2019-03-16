import java.util.Scanner;
public class Objective4Lab4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number");
      int i = sc.nextInt();
    if (i%2==0){
      System.out.println("the number is even");
    }else {
      System.out.println("the numbr is odd");
    }
  }
}
