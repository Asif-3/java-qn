package friday;

import java.util.Scanner;

public class _1stletterUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans=" ";
        boolean space=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                ans+=ch;
                space=true;
            }else{
                if(space && ch>='a' && ch<='z'){
                    ans+=(char)(ch-32);
                }
                else if(ch>='A' && ch<='Z'){
                    ans+=(char)(ch+32);

                }
                else{
                    ans+=ch;
                }
                space=false;
            }
        }
        System.out.println(ans);
    }
}
// this is the end
//  This Is The End