package friday;
import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Prime numbers: ");
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            int count = 0;
            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
