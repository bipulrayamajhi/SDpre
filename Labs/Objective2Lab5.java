public class Objective2Lab5 {
  public static void main(String[] args){
    double side1=Math.pow(10.0,2);
    double side2= Math.pow(8.0,2);
    double num= side1+side2;
    double hypotenuse =Math.sqrt(num);
    // double num = Math.sqrt(3 * 3);    //num => 3
    //result => 2 + 3 => 5
    System.out.println("the hypotenuse of a triagle whith sides 10 and 8 is"+ hypotenuse);
}
}
