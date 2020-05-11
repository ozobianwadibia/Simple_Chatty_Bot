import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //        System.out.println("Enter the three sides: ");
        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        String answer = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 ? "YES" : "NO";
        System.out.println(answer);
    }

}