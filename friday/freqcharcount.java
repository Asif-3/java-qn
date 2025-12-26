package friday;
import java.util.Scanner;
public class freqcharcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[128];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                System.out.println((char)i+" "+freq[i]);
            }
        }
    }
}
// aasif
// a 2
// f 1
// i 1
// s 1