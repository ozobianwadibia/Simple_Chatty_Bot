import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter the number(s): ");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (scanner.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}