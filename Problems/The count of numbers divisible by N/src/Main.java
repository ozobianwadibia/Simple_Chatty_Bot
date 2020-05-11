import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        int numThree = sc.nextInt();

        int count = 0;

        for (int i = numOne; i <= numTwo; i++) {
            if (i % numThree == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}