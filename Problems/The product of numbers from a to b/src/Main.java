import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 2 numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        long product = 1L;

        for (int i = firstNumber; i < secondNumber; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}