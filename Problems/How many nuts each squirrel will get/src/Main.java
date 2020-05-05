import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        System.out.println("Enter numbers: ");
        int numberOfSquirrels = scanner.nextInt();
        int nutsFound = scanner.nextInt();

        int amtReceived = nutsFound / numberOfSquirrels;
        System.out.println(amtReceived);

    }
}