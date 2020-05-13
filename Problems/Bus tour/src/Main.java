import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Enter bus height: ");
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        //System.out.println("Enter number of buses: ");
        int bridgeNumber = sc.nextInt();

        int[] bridges = new int[bridgeNumber];
        //System.out.println("Enter the bridge heights: ");
        for (int i = 0; i < bridges.length; i++) {
            bridges[i] = sc.nextInt();
        }
        int countWillCrash = 0; // count for 'will crash'
        int countWillNotCrash = 0; // count for 'will not crash'

        for (int i = 0; i < bridges.length; i++) {
            if (busHeight >= bridges[i]) {
                countWillCrash++;
                if (countWillCrash == 1) {
                    System.out.println("Will crash on bridge " + (i + 1));
                }
            } else {
                countWillNotCrash++;
                if (countWillNotCrash == bridges.length) {
                    System.out.println("Will not crash");
                }
            }
        }
    }
}