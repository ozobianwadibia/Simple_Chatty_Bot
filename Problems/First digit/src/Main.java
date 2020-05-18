import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter a 2 digit number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstDigit;
        int secondDigit = number % 10;

        firstDigit = (number - secondDigit) / 10;
        System.out.println(firstDigit);

    }
}