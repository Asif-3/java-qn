//reverse an array 

import java.util.Scanner;

public class qn11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int len=sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The reversed array is : ");
        for(int i=0;i<len;i++){
            System.out.print(arr[len-1-i]+" ");
        }
    }
}
