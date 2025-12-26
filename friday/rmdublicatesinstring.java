package friday;

import java.util.Scanner;

public class rmdublicatesinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq[] = new int[126];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        boolean present=true;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                present=false;
                break;
            }
        }
        if (present) {
            System.out.println("null");
        }
        else{
            for(int i=0;i<126;i++){
                if(freq[i]>1){
                    System.out.print((char)i);
                }
            }
        }
    }
}
// aabbcc
// abc