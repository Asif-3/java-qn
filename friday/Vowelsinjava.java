package friday;
import java.util.Scanner;
public class Vowelsinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonents: " + consonents);
    }
}
// asif
// Number of vowels: 2
// Number of consonents: 2