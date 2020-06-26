import java.util.Scanner;
class Main {
static Scanner scanboi =  new Scanner (System.in);
  public static void main(String[] args) throws InterruptedException{
    System.out.println("Welcome to the world's most useless calculator!");
    Thread.sleep(3500);
    System.out.println("Please enter your desired function (addition, subtraction, multiplication, division).");
    String userinputstring = scanboi.nextLine();
    if (userinputstring.equals ("addition")){addition();}
    else if (userinputstring.equals ("subtraction")){subtraction();}
}
  public static void addition(){
    System.out.println("You have selected addition! Please enter the first number you wish to add.");
    int userinputint = scanboi.nextInt();
    System.out.println("Great! Type in one more number.");
    int userinputint2 = scanboi.nextInt();
    int userresult = userinputint+userinputint2;
    System.out.print("The answer is ");
    System.out.print(userresult);
    System.out.println("!");
  }
  public static void subtraction(){
    System.out.println("You have selected subtraction! Please enter the number you wish to subtract from.");
    int userinputint = scanboi.nextInt();
    System.out.println("Great! Now please enter the number you wish to subtract that number by.");
  }







}