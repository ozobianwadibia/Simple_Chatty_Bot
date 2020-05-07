import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        System.out.println("Enter params here: ");
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int R = A - B;
        int rate = H / R;
        System.out.println(rate);


    }
}