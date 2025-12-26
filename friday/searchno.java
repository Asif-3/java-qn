package friday;

import java.util.Scanner;

public class searchno {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [][]arr=new int[len][len];
        int k=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                arr[i][j]=sc.nextInt();
             
            }
        }
        boolean n=false;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i][j]==k){
                    n=true;
                    break;
            }
        }
    }
        if(n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
}}
