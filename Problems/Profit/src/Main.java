import java.util.*;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);

        double principal = scanner.nextDouble(); // M
        double rate = scanner.nextDouble(); // P
        double finalAmount = scanner.nextDouble(); // K

        // compound interest formula: A = P(1 + r)^t
        // make t the subject of the formula

        double dividend = Math.log10(finalAmount / principal);
        double divisor = Math.log10(1 + (rate / 100));
        double time = dividend / divisor;

        time = Math.ceil(time);
        int newTime = (int) time;

        System.out.println(newTime);
    }
}