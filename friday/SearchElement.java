package friday;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        boolean present = false;
        for (int i = 0; i < len; i++) {
            if (arr[i] == n) {
                present = true;
                break;
            }
        }
        if (present)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
