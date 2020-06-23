import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanboiuno = new Scanner(System.in);
    System.out.println("Welcome to Connect Four, please enter your name!");
    String playeronename = scanboiuno.nextLine();
    System.out.print("Great! Nice to meet you ");
    System.out.println(playeronename + "!");
    String[][] boardhahafunny = new String[6][7];
    for (int rows = 0; rows < 6; rows++) {
      for (int columns = 0; columns < 7; columns++) {
        boardhahafunny[rows][columns] = "_  ";
        System.out.print(boardhahafunny[rows][columns]);
      }
        System.out.println();
    }
    
  }
}