import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter three numbers: ");

        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        // the boolean variable already has a set value: false
        boolean solution = numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree;
        System.out.println(solution);

    }
}
