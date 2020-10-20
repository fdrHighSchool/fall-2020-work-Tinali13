import java.util.*;
  public class RandomNumber {
  public static void main (String[] args) {
    int again = 1;
    Scanner input = new Scanner (System.in);
    while(again == 1){
      System.out.print("Input your first name: ");
      String first_name = input.next();
      System.out.print("Input your last name: ");
      String last_name = input.next();
      System.out.println();
      System.out.println("Hello "+first_name+" "+last_name);

      printMenu();

      int choice = input.nextInt();
      System.out.println("You chose " +choice);
      int range = 0;
      Random dice = new Random();
      double randomNumber;

      if(choice == 1){
        System.out.println("You chose Easy mode.");
        System.out.println("Choose a number between 1-10.");
        range = 10;
        randomNumber = dice.nextInt(range) + 1;
        int userChoice = input.nextInt();
        checkAnswer(input, randomNumber, userChoice, 0, range);

      }else if(choice == 2){
        System.out.println("You chose Medium mode.");
        System.out.println("Choose a number between 1-50.");
        range = 50;
        randomNumber = dice.nextInt(range) + 1;
        int userChoice = input.nextInt();
        checkAnswer(input, randomNumber, userChoice, 0, range);
      }else{
        System.out.println("You chose Hard mode.");
        System.out.println("Choose a number between 1-100.");
        range = 100;
        randomNumber = dice.nextInt(range) + 1;
        int userChoice = input.nextInt();
        checkAnswer(input, randomNumber, userChoice, 0, range);
      }

       System.out.println("Do you want to play again?");
       System.out.println("1 - Yes");
       System.out.println("2 - No");
       again = input.nextInt();
    }

    System.out.println("Thanks for playing!");

  }

  public static void checkAnswer(Scanner input,double randomNumber, int userChoice, int min, int max){

      while(randomNumber != userChoice){
        if(userChoice < randomNumber){
          System.out.println("Too Low " );
          System.out.println("Please try again");
          min = userChoice + 1;
          System.out.println("Hint: Choose a number between " + min + "-" + max);
          userChoice = input.nextInt();
        }else if(userChoice > randomNumber){
          System.out.println("Too High " );
          System.out.println("Please try again");
          max = userChoice -1;
          System.out.println("Hint: Choose a number between " + min + "-" + max);
          userChoice = input.nextInt();
        }

      }
      System.out.println("You got it!");
  }

  public static void printMenu(){
    System.out.println("What difficulty do you want?");
    System.out.println("1 - Easy");
    System.out.println("2 - Medium");
    System.out.println("3 - Hard");

  }
}
