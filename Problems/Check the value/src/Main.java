import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        int number = Integer.parseInt(value);

        boolean answer = number < 10 ? true : false;
        System.out.println(answer);
    }
}