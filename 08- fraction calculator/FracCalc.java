import java.util.*;
class FracCalc
{
    public static void main(String[] args)
    {
        boolean run = true;
        while (run)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter your problem here or \"quit\": ");
            String expression = input.nextLine();
            expression = expression.toLowerCase();
            if (!(expression.equals("quit")))
            {
                System.out.println(produceAnswer(expression));
            }
            // else - user does not want to continue //
            else
            {
                System.out.println("BYE :)");
                run = false;
            }//end if else
        }//end switch case
    }// end while run
    public static String produceAnswer(String input)
    {
        String fraction1 = input.substring(0, input.indexOf(' '));
        System.out.println("Frac 1: "  + fraction1);
        String operator = input.substring(fraction1.length() + 1, fraction1.length() + 2);
        System.out.println("Op: " + operator);
        String fraction2 = input.substring(fraction1.length() + 3);
        System.out.println("Frac 2: " + fraction2);
        int whole1 = findWhole(fraction1);
        int whole2 = findWhole(fraction2);
        int denom1 = findDenom(fraction1);
        int denom2 = findDenom(fraction2);
        int num1 = toImproperNum(whole1, findNum(fraction1), denom1);
        int num2 = toImproperNum(whole2, findNum(fraction2), denom2);
        int newNum = 0;
        int newDenom = 0;

        //return (fraction2);

        //This part of the code prints out the first fraction, second fraction, and the operator used in the equation that the userInputed.

        // int Whole = findWhole(fraction2);
        // int Num = findNum(fraction2);
        // int Denom = findDenom(fraction2);
       String answer = "";
        switch (operator)
            {
            //switch case is used in my case to organize the code better and use it to run the different operators.
            case "+":
                System.out.println("The operator is Addition.");
                newNum = num1 * denom2 + num2 * denom1;
                newDenom = denom1 * denom2;
                answer = reduce(newNum, newDenom);
                break; //breaks are used in switch cases to stop that specific case and with this you can start another case on the next line.
                //This case is used to run the addition operator.
            case "-" :
                System.out.println("The operator is Subtraction.");
                newNum = num1 * denom2 - num2 * denom1;
                newDenom = denom1 * denom2;
                answer = reduce(newNum, newDenom);
                break;
            case "/":
                System.out.println("The operator is Division.");
                newNum = num1 * denom2;
                newDenom = denom1 * num2;
                answer = reduce(newNum, newDenom);
                break;
            case "*":
                System.out.println("The operator is Multiplication.");
                newNum = num1 * num2;
                newDenom = denom1 * denom2;
                answer = reduce(newNum, newDenom);
                break;
            default:
                System.out.println ("Not a valid operator.");
                //defualt is activated when the UserInput isnt using any of the operators in the cases above.

            }//end switch(operator)

        // String checkpoint2 = "Whole: " + Whole + " Numerator: " + Num + "  Denominator: " + Denom;
        return answer;

    }//end produceAnswer

    public static int findWhole(String str)
    {
        if (str.contains("_"))
        {
            return Integer.parseInt(str.substring(0, str.indexOf('_')));
        }
        else if (str.contains("/"))
        {
            return 0;
        }
        else
          return Integer.parseInt(str);
          //this function returns the string because its none of the others above it just prints out the variable stored in the string.

    }//end findWhole function


    public static int findNum (String str)
    {
        if (str.contains("_"))
        {
            return Integer.parseInt(str.substring(str.indexOf('_') + 1, str.indexOf('/')));
        }
        else if (str.contains("/"))
        {
            return Integer.parseInt(str.substring(0, str.indexOf('/')));
        }
        else
        {
            return 0;
        }
    }//end findNum

    public static int findDenom(String str)
    {
        if (str.contains("/"))
        {
            return Integer.parseInt(str.substring(str.indexOf("/") + 1));
        }
        else
        {
            return 1;
        }//This returns 1 because if its none of the cases above then the denominator will be 1.

    }//end findDenom

    public static int toImproperNum(int whole, int Num, int Denom)
    {
        int numerator = (Denom * whole) + Num;
        // String improperFrac = numerator + "/" + Denom;
        return numerator;
        // this function turns the fractions into improper fractions.
    }//end toImproperFrac
    public static String reduce(int num, int den){
      int GCD = GCD(num,den);
      num = num/GCD;
      den = den/GCD;
      String fraction = String.valueOf(num) + "/" + String.valueOf(den);
      return fraction;
    }
    public static int GCD(int num,int den){
      // int numerator1 = Integer.parseInt(frac1.substring(0, frac1.indexOf('/')));
      // int denominator1 = Integer.parseInt(frac1.substring(frac1.indexOf("/") + 1));
      // int numerator2 = Integer.parseInt(frac2.substring(0, frac2.indexOf('/')));
      // int denominator2 = Integer.parseInt(frac2.substring(frac2.indexOf("/") + 1));
      if(den == 0){
        return num;
      }
      return GCD(den, num % den);
    } //end GCD
}//end Main
