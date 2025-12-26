package friday;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // octal number

        int sum = 0;
        int pos = 1;          // 8^0

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * pos;
            pos = pos * 8;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
