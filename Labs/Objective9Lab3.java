import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    printMenu();
    int selection;
    

    while(true){
      selection = scanner.nextInt();

      if (true) {
        System.out.println("Hello Human!");
        printMenu();
        selection = scanner.nextInt();
      }
      if (true) {
        System.out.println("Apples, Bananas, Coconuts");
        printMenu();
        selection = scanner.nextInt();
      }
      if (true) {
        System.out.println("Goodbye! See you later.");
        selection = scanner.nextInt();
      }
      
    scanner.close();
      }
  }

  public static void printMenu() {
    System.out.println(" __________Menu___________");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}