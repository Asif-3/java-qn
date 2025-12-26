package friday;

import java.util.Scanner;

public class lefttri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        for (int i = 1; i <= len; i++) {
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
