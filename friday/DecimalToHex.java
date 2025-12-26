package friday;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String hex = "";

        while (n > 0) {
            int temp = n % 16;

            if (temp < 10)
                hex = temp + hex;
            else
                hex = (char)(temp - 10 + 'A') + hex;

            n = n / 16;
        }

        System.out.println(hex);
    }
}

