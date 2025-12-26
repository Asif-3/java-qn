package friday;

import java.util.Scanner;

public class findnoinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num++;
                System.out.print(ch + " ");
            }
        }
    }
}
// a1b2c3d4
// 1 2 3 4