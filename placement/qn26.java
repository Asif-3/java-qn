//upper case and lower case

import java.util.Scanner;

public class qn26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int special=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //System.out.print((char)(ch-32));
            System.out.print((char)(ch+32));
            
}}}