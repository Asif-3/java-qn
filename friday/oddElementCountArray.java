package friday;

import java.util.Scanner;

public class oddElementCountArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];
    int count = 0;

    for(int i = 0; i < len; i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i < len; i++){
        if(arr[i] % 2 == 1){
            count++;
        }
     }
    System.out.println(count);
    } }