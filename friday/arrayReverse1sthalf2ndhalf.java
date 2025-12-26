package friday;

import java.util.Scanner;

public class arrayReverse1sthalf2ndhalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int half=(len/2);
        int m=0;
        int j=half-1;
        while(m<j){
            int temp=arr[m];
            arr[m]=arr[j];
            arr[j]=temp;
            m++;
            j--;
        }
        int p=half;
        int q=len-1;
        while(p<q){
            int temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            p++;
            q--;
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// 5
// 1 2 3 4 5  
// 2 1 5 4 3 