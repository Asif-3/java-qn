package friday;
import java.util.Scanner;
public class num_divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
