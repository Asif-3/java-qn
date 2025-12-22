//find second largest number in array
import java.util.Scanner;

public class qn12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[len-2]);
    }
}
