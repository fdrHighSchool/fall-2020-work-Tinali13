import java.util.Scanner;
class Main {
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
  //return (fraction2);
  String Whole = findWhole(fraction2);
  String Num = findNum(fraction2);
  String Denom = findDenom(fraction2);
  String checkpoint2 = "Whole:" + Whole + "numerator:" + Num + "denominator:" +Denom;
  return checkpoint2;
 }
 public static String findWhole(String str){
   if (str.contains("_")){
     return str.substring(0, str.indexOf('_'));
   }else if (str.contains("/")){
     return "0";
  }else return str;
 }
  public static String findNum (String str){
    if (str.contains("_")){
      return str.substring(str.indexOf('_')+ 1, str.indexOf('/'));
    }else if (str.contains("/")){
      return str.substring(0,str.indexOf('/'));
    }else{
      return "0";
    }
  }
  public static String findDenom(String str){
    if (str.contains("/")){
      return str.substring(str.indexOf("/")+1);
    }else{
      return "1";
    }
  }
}
