package friday;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[]freq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                freq[ch-'A']++;
            }
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        boolean isPangram=true;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                isPangram=false;
                break;
            }
        }
        if(isPangram){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
