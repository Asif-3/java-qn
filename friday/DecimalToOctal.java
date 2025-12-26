package friday;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int octal = 0;
        int pos = 1;

        while (n > 0) {
            int rem = n % 8;
            octal = octal + rem * pos;
            pos = pos * 10;
            n = n / 8;
        }

        System.out.println(octal);
    }
}
