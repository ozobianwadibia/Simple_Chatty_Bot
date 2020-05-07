import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter a three digit number: ");
        Scanner scanner = new Scanner(System.in);

        int reversedNumber = 0;
        int lastDigit;
        int myNumber = scanner.nextInt();

        while(myNumber !=0) {
            lastDigit = myNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            myNumber = myNumber / 10;
        }
        System.out.println(reversedNumber);
    }
}