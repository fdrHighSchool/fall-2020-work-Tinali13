import java.util.*;
public class Average {;
  public static void main(String[] args) {;
    //ask for 3 test grades
    System.out.println("What score did you get?");
    Scanner input = new Scanner(System.in);
    double sum = 0;
    System.out.println("Enter the first score: ");
    sum += input.nextInt();
    System.out.println("Enter the second score: ");
    sum += input.nextInt();
    System.out.println("Enter the third score: ");
    sum += input.nextInt();
    //print statement to test that things are working!
    System.out.println("Your sum is");
    System.out.println(sum);
    System.out.println("Your overall Average is " +sum/3);
    //calculate the Average
    //output the data on the screen
  }// end main method
}// end class
