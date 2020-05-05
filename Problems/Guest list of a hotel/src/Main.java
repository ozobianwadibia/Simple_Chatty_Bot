//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        System.out.println("Enter the names, below: ");
        Scanner sc = new Scanner(System.in);

        // storing the anticipated names in string arrays and splitting them
        String[] names1 = sc.nextLine().split(" ");
        String[] names2 = sc.nextLine().split(" ");
        String[] names3 = sc.nextLine().split(" ");
        String[] names4 = sc.nextLine().split(" ");

        // each array is reversed before printing to the console.
        for (int i = names4.length - 1; i >= 0; i--) {
            System.out.println(names4[i]);
        }

        for (int i = names3.length - 1; i >= 0; i--) {
            System.out.println(names3[i]);
        }

        for (int i = names2.length - 1; i >= 0; i--) {
            System.out.println(names2[i]);
        }

        for (int i = names1.length - 1; i >= 0; i--) {
            System.out.println(names1[i]);
        }

    }
}