package friday;
import java.util.*;
public class count_no_in_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            num=num/10;
            sum++;
        }
        System.out.println(sum);
    }
}
