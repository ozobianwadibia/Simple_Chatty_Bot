import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first time: ");

        int hoursOne = scanner.nextInt();
        int minutesOne = scanner.nextInt();
        int secondsOne = scanner.nextInt();

//        System.out.println("Enter the second time: ");
        int hoursTwo = scanner.nextInt();
        int minutesTwo = scanner.nextInt();
        int secondsTwo = scanner.nextInt();

        int initialTimeInSeconds = (hoursOne * 60 * 60) + (minutesOne * 60) + (secondsOne);
        int finalTimeInSeconds = (hoursTwo * 60 * 60) + (minutesTwo * 60) + (secondsTwo);
        int timeDifference = finalTimeInSeconds - initialTimeInSeconds;

        System.out.println(timeDifference);

    }
}