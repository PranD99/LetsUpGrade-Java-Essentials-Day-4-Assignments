import java.util.Arrays;
import java.util.Scanner;
public class SumOfElementsOfAnArray {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
      int myArray[] = new int [5];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<5; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array ::"+sum);
   }
}