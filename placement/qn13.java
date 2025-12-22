//pangram or not
import java.util.Scanner;
public class qn13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];  
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a'] = 1;
            }
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A'] = 1;
            }
        }
        boolean Pangram = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                Pangram = false;
                break;
            }
        }
        if (Pangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
