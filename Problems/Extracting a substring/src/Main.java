import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        System.out.println("Enter word, followed by 2 integers: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String first = sc.next();
        int firstNum = Integer.parseInt(first);
        String second = sc.next();
        int secondNum = Integer.parseInt(second);
        String newWord = word.substring(firstNum, secondNum + 1);

        System.out.println(newWord);
    }
}