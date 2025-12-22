//find special characters in a string

import java.util.Scanner;

public class qn21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int special=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9' || ch==' ')){
                special++;
            }
            
}
System.out.print(special);
}}