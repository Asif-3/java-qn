package friday;

import java.util.Scanner;

public class countElementOccurenceFREQ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        int[] freq=new int[100];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+"=>"+freq[i]);
            }
        }
    }
    
}
// 6
// 2 2 2 3 3 3
// 2=>3
// 3=>3
