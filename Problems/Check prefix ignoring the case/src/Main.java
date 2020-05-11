import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        System.out.println("Enter Word: ");
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        boolean answer = word.charAt(0) == 'J' || word.charAt(0) == 'j';
        System.out.println(answer);


    }
}