package friday;
import java.util.Scanner;
public class age_voter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
