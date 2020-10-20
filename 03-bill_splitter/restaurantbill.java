import java.util.*;
import java.util.Scanner;
    public class restaurantbill{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   double restaurantbill;
   double tax;
   double tip;
   double totalcost;
   double evenly;
   double evenly1;
   System.out.println("Please enter your restaurant bill without tax and tip:  " );
   restaurantbill = input.nextDouble();
  System.out.println("Please enter how many people are here so it can be divided evenly: ");
   evenly = input.nextDouble();
   tax = 0.0875 * restaurantbill;
   System.out.println("This is tax amount: " +tax);
   tip = 0.15 * restaurantbill;
   System.out.println("This is tip amount: " +tip);
   totalcost = restaurantbill + tax + tip;
   evenly1 = totalcost / evenly;
   System.out.println("This is how much everyone needs to pay for it to be evenly: " +evenly1);

  }//end main method
    }//end class


    //add tax and tip and then split the bill evenly.
