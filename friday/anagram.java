package friday;

import java.util.Scanner;

class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();    
        String str2 = sc.nextLine();
        int freq[]=new int[128];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)]--;
        }
        boolean anagram=true;
        for(int i=0;i<128;i++){
            if(freq[i]!=0){
                anagram=false;
                break;
            }
        }
        if(anagram){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
//sriram
// ramsri
// anagram