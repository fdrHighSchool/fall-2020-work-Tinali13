import java.util.*;
import java.util.Scanner;
public class Shapes{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
     System.out.println("1 = circle, 2 = square, 3 = triangle, 4 = rectangle, 5 = cylinder, 6 = Sphere, 7 = Cube, 8 == RectangularPrism");
        int object = input.nextInt();

        if (object == 1){
          System.out.println("Enter your circle radius in here: ");
          double radius = input.nextDouble();
          double circlearea = radius * radius * 3.14;
          System.out.println("The area of the circle is:" +circlearea);
        }
        else if (object == 2){
          System.out.println ("Enter your square Length: ");
          double side = input.nextDouble();
          double Area = side * side;
          System.out.println ("The Area of the square is:"+Area);
        }
        else if (object == 3){
          System.out.println ("Enter your triangle height: ");
          double height = input.nextDouble();
          System.out.println ("Enter your triangle base Length2: ");
          double Length2 = input.nextDouble();
          double tArea = height * Length2 * 0.5;
          System.out.println ("The area of the triangle is:" +tArea);
        }
        else if (object == 4){
          System.out.println("Enter your rectangle width: ");
          double width = input.nextDouble();
          System.out.println ("Enter your rectangle Length3: ");
          double Length3 = input.nextDouble();
          double Area2 = width * Length3;
          System.out.println("The area of the rectangle is:" +Area2);
        }
        else if (object == 5){
          System.out.println("Enter your cylinder Height2: ");
          double Height2 = input.nextDouble();
          System.out.println("Enter your cylinder Radius2: ");
          double Radius2 = input.nextDouble();
          double volume = 3.14 * Radius2 * Radius2 * Height2;
          System.out.println("The volume of the cylinder is:" +volume);
        }
        else if (object == 6){
          System.out.println("Enter your sphere Radius3:");
          double Radius3 = input.nextDouble();
          double volume2 = 1.33 * 3.14 * Radius3 * Radius3 * Radius3;
          System.out.println("The volume of the sphere is:" +volume2);
        }
        else if (object == 7){
          System.out.println("Enter your cube edge: ");
          double edge = input.nextDouble();
          double volume3 = edge * edge *edge;
          System.out.println("The volume of the cube is: +volume3");
        }
        else if (object == 8){
          System.out.println("Enter your RectangularPrism width1: ");
          double width1 = input.nextDouble();
          System.out.println("Enter your RectengularPrism Length4: ");
          double Length4 = input.nextDouble();
          System.out.println("Enter your RectangularPrism Height3: ");
          double Height3 = input.nextDouble();
          double volume4 = width1 * Length4 * Height3;
        }
      else{
        System.out.println("Error pleaese enter a number between 1 to 8");
        }
  }//end main
}// end class
