import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      Scanner input = new Scanner(System.in);
      System.out.println("\nEnter your problem here or \"quit\": ");
      String expression = input.nextLine();
      expression = expression.toLowerCase();
      if (!(expression.equals("quit"))) {
        // basically this is saying that if a user DID NOT write 'quit' then we want to do something //
        // code goes here //
        System.out.println(produceAnswer(expression));
      }
      // else - user does not want to continue //
      else {
        System.out.println("BYE :)");
        run = false;
      }
    }
  }


 public static String produceAnswer(String input){
   String fraction1 = input.substring(0, input.indexOf(' '));
   System.out.println("Frac 1: "  +fraction1);
   String operator = input.substring(fraction1.length() + 1, fraction1.length() + 2);
   System.out.println("Op: " +operator);
   String fraction2 = input.substring(fraction1.length() + 3);
   System.out.println("Frac 2: " +fraction2);
   //return (fraction2);
   String Whole = findWhole(fraction2);
   String Num = findNum(fraction2);
   String Denom = findDenom(fraction2);
  String checkpoint2 = "Whole: " + Whole + " Numerator: " + Num + "  Denominator: " + Denom;
   return checkpoint2;
  }//end produceAnswer

  public static String findWhole(String str){
    if (str.contains("_")){
      return str.substring(0, str.indexOf('_'));
    }else if (str.contains("/")){
      return "findWhole";
   }else return str;
  }
  public static String findNum (String str){
     if (str.contains("_")){
       return str.substring(str.indexOf('_')+ 1, str.indexOf('/'));
     }else if (str.contains("/")){
       return str.substring(0,str.indexOf('/'));
     }else{
       return "findNum";
     }
   }
   public static String findDenom(String str){
     if (str.contains("/")){
       return str.substring(str.indexOf("/")+1);
     }else{
       return "findDenom";
     }
   }
}
