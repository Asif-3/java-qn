package friday;

import java.util.Scanner;

public class spaceinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();  
        int space=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){ 
                space++;
            }
            
        }
        System.out.println(space);
    }
}
// a ss dd f
// 3