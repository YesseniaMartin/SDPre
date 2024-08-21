import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 4;

    while (true) {
      System.out.println(" __________Menu___________");
      System.out.println("|1: Say Hello.            |");
      System.out.println("|2: List My favorite foods|");
      System.out.println("|3: Exit                  |");
      System.out.println();
      selection = scanner.nextInt();
      
      if (true) {
        //System.out.println("1");
        System.out.println("Hello Human!");
        System.out.println(" __________Menu___________");
        System.out.println("|1: Say Hello.            |");
        System.out.println("|2: List My favorite foods|");
        System.out.println("|3: Exit                  |");
        
        selection = scanner.nextInt();
      }
      if (true) {
        //System.out.println("2");
        System.out.println("Apples, Bananas, Coconuts");
        System.out.println(" __________Menu___________");
        System.out.println("|1: Say Hello.            |");
        System.out.println("|2: List My favorite foods|");
        System.out.println("|3: Exit                  |");

        selection = scanner.nextInt();
      }

      if (true){
        //System.out.println("3");
          System.out.println("Goodbye! See you later.");
          selection = scanner.nextInt();
        }

        scanner.close();
    }
  }
}

