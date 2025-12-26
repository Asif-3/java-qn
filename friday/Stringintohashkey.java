package friday;

import java.util.Scanner;

public class Stringintohashkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=(int)ch;
            System.out.println(ch+"=>"+n);
        }
    }
}
// A
// A=>65