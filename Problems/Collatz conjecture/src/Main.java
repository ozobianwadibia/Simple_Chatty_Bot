import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        collatzConjecture(number);
    }

    // The (3n + 1) problem
     public static void collatzConjecture(int number) {
         System.out.print(number + " ");
        if (number == 1) {
            return;
        } else if (number % 2 == 0) {
            collatzConjecture(number / 2);
         } else {
            collatzConjecture(number * 3 + 1);
        }
    }
}