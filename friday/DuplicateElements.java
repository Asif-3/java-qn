package friday;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[100];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println("Duplicate element: " + i);
            }
        }
    }
}

// 6
// 1 1 2 2 4 3
// Duplicate element: 1
// Duplicate element: 2