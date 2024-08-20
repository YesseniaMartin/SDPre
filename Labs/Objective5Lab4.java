
import java.util.Scanner;

public class Objective5Lab4 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int num = 6;

        System.out.println("Please enter a number");
        int numInput = scanner.nextInt();

        if(numInput % 2 == 0){
          System.out.println("the number " + numInput + " is even.");
        }

        else{
          System.out.println("The number " + numInput + " is odd");
        }


    scanner.close();
  }
}
      