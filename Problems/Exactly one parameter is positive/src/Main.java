import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean a = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean b = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean c = num3 > 0 && num1 <= 0 && num2 <= 0;

        boolean solution = a || b || c;
        System.out.println(solution);
    }
}