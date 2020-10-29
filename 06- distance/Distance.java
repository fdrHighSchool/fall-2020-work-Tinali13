import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String []args){
        Scanner s = new Scanner(System.in);
            System.out.print("Enter point 1: ");
            String point1 = s.nextLine();
            System.out.print("Enter point 2: ");
            String point2 = s.nextLine();
             System.out.printf("The distance between %s and %s is...\n", point1, point2);

    int x1 = getX(point1);
    int x2 = getX(point2);
    int y1 = getY(point1);
    int y2 = getY(point2);

    //calculates the shortest distance between the two points
    System.out.println (cartesianDistance(x1,y1,x2,y2));
    //calculates the taxi cab distance between two points
    System.out.println(taxiCabDistance(x1,y1,x2,y2));

     }

     public static double cartesianDistance(double x1, double y1, double x2, double y2) {
       // square root of (x2 – x1)^2 + (y2 – y1)^2
       double distance = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
       return distance;
     }

     public static double taxiCabDistance(double x1, double y1, double x2, double y2) {
       // |y1 – y2| + |x1 – x2|
       double distance = Math.abs(y1-y2) + Math.abs(x1-x2);
       return distance;
     }
     public static int getX(String point){
       int comma = point.indexOf(",");
         String x = point.substring(1, comma);
       //System.out.println(x);
    return Integer.parseInt(x);
     }//end getX method
      public static int getY(String point){
       int comma1 = point.indexOf(",");
        int space = point.indexOf(")");

  String y = point.substring(comma1 + 2, space );


  return Integer.parseInt(y);
     }//end getY method
   }
