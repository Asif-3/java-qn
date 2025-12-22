//identify the spcae in a string
import java.util.Scanner;

public class qn19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int spaces=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                spaces++;
            }
        }
        System.out.println(spaces + " spaces");
    }
}