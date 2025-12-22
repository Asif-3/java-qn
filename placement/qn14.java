//remove consecutive duplicates from string
import java.util.Scanner;
public class qn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
