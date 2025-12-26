package friday;

import java.util.Scanner;

public class Arraypreviousgreaterno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<len;i++){
            if(i==0){
                System.out.print(arr[i]+" ");
            
        }
    }
}}
//2
// 15 14
// 15 