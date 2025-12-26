package friday;

import java.util.Scanner;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        boolean Palindrome = true;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                Palindrome = false;
                break;
            }
        }
        if (Palindrome)
            System.out.println("Palindrome Array");
        else
            System.out.println("Not a Palindrome Array");
    }
}
