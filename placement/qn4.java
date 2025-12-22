//string palindrome

import java.util.Scanner;

public class qn4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();    
    boolean palindrome=true;
    for (int i=0;i<str.length();i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            palindrome=false;
            break;
        }
    }
    if(palindrome){
        System.out.println("Yes given string is palindrome: "+str);
    }
    else{
        System.out.println("No given String is not a palindrome: "+str);
    }
    }
    

}
