import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter 2 words: ");
        Scanner sc = new Scanner(System.in);
        String stringOne = sc.nextLine().trim().replace(" ", "");
        String stringTwo = sc.nextLine().trim().replace(" ", "");

        String answer = (stringOne.equals(stringTwo)) ? "true" : "false";
        System.out.println(answer);
    }
}