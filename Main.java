import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //objects are created from classes
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to our show reccomendation program! What time are you home to watch tv?");
    String name = scan.next();
    
    sum(2,3);
   
  }

  static int sum(int num1, int num2)
  {
    return num1 + num2;
  }



}