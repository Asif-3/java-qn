package friday;
import java.util.Scanner;
public class one_to_100 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=100){
            System.out.println("yes this is in range");
        }
        else{
            System.out.println("no");
        }
    }
    
}
