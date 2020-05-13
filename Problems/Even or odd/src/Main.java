import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);

        int number;
        while ((number = scanner.nextInt()) != 0) {
            String printOut = number % 2 == 0 ? "even" : "odd";
            System.out.println(printOut);
        }
      }
    }
