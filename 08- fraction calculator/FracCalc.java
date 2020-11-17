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
                // basically this is saying that if a user DID NOT write 'quit' then we want to do something //
                // code goes here //
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
        //return (fraction2);

        // int Whole = findWhole(fraction2);
        // int Num = findNum(fraction2);
        // int Denom = findDenom(fraction2);
       String answer = "";
        switch (operator)
            {

            case "+":
                System.out.println ("The operator is Addition.");
                int whole1 = findWhole(fraction1);
                int whole2 = findWhole(fraction2);

                int denom1 = findDenom(fraction1);
                int denom2 = findDenom(fraction2);

                int num1 = findNum(fraction1);
                int num2 = findNum(fraction2);

                String improperFrac1 = toImproperFrac(whole1, num1, denom1);
                String improperFrac2 = toImproperFrac(whole2, num2, denom2);

                int GCDDenom = GCD(improperFrac1, improperFrac2);



                int newNum1 = (GCDDenom/denom1) * Integer.parseInt(improperFrac1.substring(0, improperFrac1.indexOf("/")));
                int newNum2 = (GCDDenom/denom2) * Integer.parseInt(improperFrac2.substring(0, improperFrac2.indexOf("/")));



                answer = (newNum1 + newNum2) + "/" + GCDDenom;
                break;
            case "-" :
                System.out.println ("The operator is Subtraction.");
                int whole3 = findWhole(fraction1);
                int whole4 = findWhole(fraction2);

                int denom3 = findDenom(fraction1);
                int denom4 = findDenom(fraction2);

                int num3 = findNum(fraction1);
                int num4 = findNum(fraction2);

                String improperFrac3 = toImproperFrac(whole3, num3, denom3);
                String improperFrac4 = toImproperFrac(whole4, num4, denom4);

                int GCDDenom1 = GCD(improperFrac3, improperFrac4);



                int newNum3 = (GCDDenom1/denom3) * Integer.parseInt(improperFrac3.substring(0, improperFrac4.indexOf("/")));
                int newNum4 = (GCDDenom1/denom4) * Integer.parseInt(improperFrac3.substring(0, improperFrac4.indexOf("/")));
                answer = (newNum3 - newNum4) + "/" + GCDDenom1;
                break;
            case "*":
                System.out.println ("The operator is Multipication.");
                int whole5 = findWhole(fraction1);
                int whole6 = findWhole(fraction2);

                int denom5 = findDenom(fraction1);
                int denom6 = findDenom(fraction2);

                int num5 = findNum(fraction1);
                int num6 = findNum(fraction2);

                String improperFrac5 = toImproperFrac(whole5, num5, denom5);
                String improperFrac6 = toImproperFrac(whole6, num6, denom6);

                int GCDDenom2 = GCD(improperFrac5, improperFrac6);



                int newNum5 = (GCDDenom2/denom5) * Integer.parseInt(improperFrac5.substring(0, improperFrac6.indexOf("/")));
                int newNum6 = (GCDDenom2/denom6) * Integer.parseInt(improperFrac5.substring(0, improperFrac6.indexOf("/")));
                answer = (newNum5 * newNum6) + "/" + GCDDenom2;
                break;
            case "/":
                System.out.println ("The operator is Division.");
                int whole7 = findWhole(fraction1);
                int whole8 = findWhole(fraction2);

                int denom7 = findDenom(fraction1);
                int denom8 = findDenom(fraction2);

                int num7 = findNum(fraction1);
                int num8 = findNum(fraction2);

                String improperFrac7 = toImproperFrac(whole7, num7, denom7);
                String improperFrac8 = toImproperFrac(whole8, num8, denom8);

                int GCDDenom3 = GCD(improperFrac7, improperFrac8);



                int newNum7 = (GCDDenom3/denom7) * Integer.parseInt(improperFrac7.substring(0, improperFrac8.indexOf("/")));
                int newNum8 = (GCDDenom3/denom8) * Integer.parseInt(improperFrac7.substring(0, improperFrac8.indexOf("/")));
                answer = (newNum7 / newNum8) + "/" + GCDDenom3;
                break;
            default:
                System.out.println ("Not a valid operator.");


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
          //what does this return?
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
        }
    }//end findDenom

    public static String toImproperFrac(int whole, int Num, int Denom)
    {
        int numerator = (Denom * whole) + Num;
        String improperFrac = numerator + "/" + Denom;
        return improperFrac;
        // this is to turn the fractions into improper fractions.
    }//end toImproperFrac

    public static int GCD (String frac1, String frac2){
      int numerator1 = Integer.parseInt(frac1.substring(0, frac1.indexOf('/')));
      int denominator1 = Integer.parseInt(frac1.substring(frac1.indexOf("/") + 1));

      int numerator2 = Integer.parseInt(frac2.substring(0, frac2.indexOf('/')));
      int denominator2 = Integer.parseInt(frac2.substring(frac2.indexOf("/") + 1));

      if(denominator1 != denominator2){
        int newDenom = denominator1 * denominator2;
        return newDenom;
      }

      return denominator1;

    } //end GCD

}//end Main
