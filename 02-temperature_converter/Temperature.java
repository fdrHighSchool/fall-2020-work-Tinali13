import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Hello! Please enter a temperature in Celsius.");
  double Celsius= in.nextDouble();
  double Fahrenheit = (9.0/5.0) * Celsius+ 32;
  System.out.println (Celsius +" Celsius = " +Fahrenheit +" F");

}
}
