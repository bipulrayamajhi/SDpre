import java.util.Scanner;
public class Objective2Lab5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sum=0.0;
    System.out.println("enter the number");
    double num1 = sc.nextDouble();
    System.out.println("enter another number");
      double num2 = sc.nextDouble();
      sum = num1+num2;
      System.out.println("the sum of "+num1+ "and"+num2+"is:" +sum);


      sc.close();


  }
}
