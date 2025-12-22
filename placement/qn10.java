//array sum of even numbers

import java.util.Scanner;
public class qn10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int num=0;
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                num=num+arr[i];
            }
        }
        System.out.println(num);
    }
}
