//array checking odd elements

import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int len=sc.nextInt();
        int[] arr =new int [len];
        for (int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int odd_count=0;
        for(int i=0;i<len-1;i++){
            if(arr[i]%2==1){//==1 vantha odd 0 vantha even
                odd_count++;
            }
        }
        System.out.println("no of odd numbers count:"+odd_count);
}
}