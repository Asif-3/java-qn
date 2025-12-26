package friday;

import java.util.Scanner;

public class maxwordinstring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        String max="";
        for(int i=0;i<arr.length;i++){
            int length=arr[i].length();
            if(length>max.length()){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
// as a a
// as