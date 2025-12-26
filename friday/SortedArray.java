package friday;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        boolean present = true;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                present = false;
                break;
            }
        }
        if (present)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is NOT Sorted");
    }
}
