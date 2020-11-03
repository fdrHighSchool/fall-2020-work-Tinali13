import java.util.Scanner;
class FracCalc {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your problem here: ");
    String problem = scan.nextLine();
    System.out.println(problem);
    produceAnswer(problem);
  }

public static String produceAnswer(String input){
  String fraction1 = input.substring(0, input.indexOf(' '));
  System.out.println("Frac 1:"  +fraction1);
  String operator = input.substring(fraction1.length() + 1, fraction1.length() + 2);
  System.out.println("Op:" +operator);
  String fraction2 = input.substring(fraction1.length() + 3);
  System.out.println("Frac 2:" +fraction2);
  return (fraction2);
 }
}
