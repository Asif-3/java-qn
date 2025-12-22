// count integer

import java.util.Scanner;

public class qn9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len =sc.nextInt();
        int []arr=new int[len];
        int []freq=new int[100];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
            System.out.println(i+"="+freq[i]);
            }
        }
    }
    
}
