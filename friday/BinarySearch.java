package friday;

import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt(); 
        int left = 0;
        int right = n - 1;
        int mid;
        boolean found = false;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == key) {
                found = true;
                System.out.println("Element found at index " + mid);
                break;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!found)
            System.out.println("Element not found");
    }
}
// 6
// 1 2 3 4 5 6
// 4
// Element found at index 3