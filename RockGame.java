import java.util.Random;
import java.util.Scanner;

public class RockGame {
   public static void main(String[] args) {
      // 0 for rock;
      // 1 for paper;
      // 2 for scissor;


      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
      System.out.print("Your choice: ");
      int userinput = sc.nextInt();

      if (userinput >= 3) {
         System.out.println("Index out of bound");
         return;
      }

      Random random = new Random();
      int computerinput = random.nextInt(3);
     
      if (userinput == computerinput) {
         System.out.println("It's Draw");
      } else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
         System.out.println("Congratulations, You Win!");
      } else {
         System.out.println("Poor luck, Computer Win!");
      }

     
      if (computerinput == 0) {
         System.out.println("Computer choose: Rock");
      } else if(computerinput == 1) {
         System.out.println("Computer choose: Paper");
      } else if(computerinput == 2) {
         System.out.println("Computer choose: Scissor");
      }
   }
}