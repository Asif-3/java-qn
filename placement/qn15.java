//count number in String 

import java.util.Scanner;

public class qn15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=48 && ch<=57){
                num++;
            }
        }
        System.out.println(num);
    }
}
