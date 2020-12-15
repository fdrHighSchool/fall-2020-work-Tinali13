import java.util.*;
public class SelfDivisor{
  public static void main(String[] args) {
    System.out.println(Arrays.toString(firstNumSelfDivisors(128,4)));

  }


  public static boolean isSelfDivisor(int number){
    int curr = number;
    int digit = 0;
    while (curr > 0){
      digit = curr % 10;
      if (digit == 0){
        return false;
       }
      if (number % digit !=0){
        return false;
      }
      curr = curr / 10;
     }
    return true;
  }

  public static int []  firstNumSelfDivisors(int start, int num){
    int [] a = new int [num];
    int StoredNumber = 0;
    int NextNumber = start;
    while (StoredNumber < num) {
      if (isSelfDivisor(NextNumber)) {
        a[StoredNumber] = NextNumber;
        StoredNumber++;
        }
        NextNumber++;
     }
    return a;
  }
}
