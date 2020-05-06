//import java.util.Scanner;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        System.out.println("Please, enter a string: ");
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String newWord = word.replace('a', 'b');
        System.out.println(newWord);
    }
}