import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // length
        int m = sc.nextInt(); // width
        int k = sc.nextInt(); // segments
        int hcf = 0;

        // calculating the highest common factor
        for (int i = 1; i < (n * m) || i < k; i++) {
            if ((n * m) % i == 0 && k % i == 0) {
                hcf = i;
            }
        }
        String answer = hcf > 1 && k <= (n * m) && (k % n == 0 || k % m == 0) ? "YES" : "NO";
        System.out.println(answer);
    }
}