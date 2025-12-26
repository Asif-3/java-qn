package friday;

import java.util.Scanner;

public class InvertedLeftTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        for (int i = len; i >= 1; i--) {
            for (int j = 1; j <= len - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
