public class Objective5Lab1 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 15;

    /*
      Fill in the following logic conditions
      
      Number 5 is not greater than 15: false
      Number 15 is greater than 5: true only the else if should print out.

    */

    if(num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
      
    }
    else if(num2 > num1) {
      System.out.println(num2 + " is greater than " + num1);
      
    }    
  }
}