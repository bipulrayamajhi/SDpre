import java.util.Scanner;
public class Objective7Lab3 {
  public static void main(String[] args) {
    while(true){
      printMenu();
    }
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number");
    int selection = sc.nextInt();
    if (selection== 1){
      System.out.println("Hello World");
    }



}




public static void printMenu() {
   System.out.println("_____Menu_____");
   System.out.println("1: Say Hello");
   System.out.println("2: List My favorite foods");
   System.out.println("3: Exit");
   System.out.println();
 }
}
