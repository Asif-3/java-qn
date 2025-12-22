//count characters in String

import java.util.Scanner;

public class qn20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int characters=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                characters++;
            }
        }
        System.out.println(characters + " characters");
    }
}
