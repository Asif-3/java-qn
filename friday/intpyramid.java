package friday;

import java.util.Scanner;

public class intpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }
}
