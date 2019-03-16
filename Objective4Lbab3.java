import java.util.Scanner;
public class Objective4Lbab3{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num1= sc.nextInt();
    if(num1>0){
      System.out.println("the number you entered is positive");
    }else {
      System.out.println("the number you entered is negative");
    }
    sc.close();
  }
}
