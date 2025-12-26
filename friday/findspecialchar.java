package friday;

import java.util.Scanner;

public class findspecialchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') )){
                System.out.print(ch+" ");
            }
        }
    }
}
