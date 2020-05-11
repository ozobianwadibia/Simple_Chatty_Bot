import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        System.out.println("Enter: ");
        Scanner sc = new Scanner(System.in);

        int atLeastRecommendedSleep = sc.nextInt();
        int atMostRecommendedSleep = sc.nextInt();
        int actualSleep = sc.nextInt();

        if (actualSleep < atLeastRecommendedSleep) {
            System.out.println("Deficiency");
        } else if (actualSleep <= atMostRecommendedSleep) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
    }
}