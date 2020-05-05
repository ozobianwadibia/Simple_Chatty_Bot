import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the words: ");
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        // the array to store a string that is split in two
        String[] input3 = sc.nextLine().split(" ");

        // print to the console.
        System.out.println(input1);
        System.out.println(input2);
        for (int i = 0; i < input3.length; i++) {
            System.out.println(input3[i]);
        }
    }
}