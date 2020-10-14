import java.util.Scanner;
public class d4q3 {
   public static void main(String args[]){
      
      Scanner s = new Scanner(System.in);
      int sum=0;
      int myArray[] = new int [5];
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<5; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      
      System.out.println("Sum of the elements of the array ::"+sum);
   }
}