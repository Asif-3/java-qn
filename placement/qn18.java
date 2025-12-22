//vowels in string

import java.util.Scanner;

public class qn18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowels=0;
        int consonent=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;

            }else{
                consonent++;
 
            }
            

        }
       System.out.println(vowels + " vowels");
System.out.println(consonent + " consonants");

}
}
