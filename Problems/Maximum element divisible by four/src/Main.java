import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        // declaring the array
        int[] myArray = new int[sc.nextInt()];
        // declaring the constant value, 4
        int divisorVariable = 4;

        // System.out.println("Enter your numbers: ");
        // populating the array
         for (int i = 0; i < myArray.length; i++) {
             myArray[i] = sc.nextInt();
         }

         int tempMax = 0; // max value
         int count = 0;  // variable for 1st occurrence of highest dividend
         Arrays.sort(myArray); // sort the array elements

         for (int i = myArray.length - 1; i >= 0; i--) {
             if (myArray[i] % divisorVariable == 0) {
                 tempMax = myArray[i];
                 count++;
                 if (count == 1) {
                     System.out.println(tempMax);
                 }
             }
         }
    }
}