//Fibonnaci series 0,1,1,2,3,5,8,13
// import java.util.Scanner;
// public class qn2 {
//     static void Fibonnaci(int num){
//         int first =0;
//         int second =1;
//         for (int i=1;i<=num;i++){
//             System.out.print(first+" ");
//             int third=first+second;
//             first=second;
//             second=third;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num = sc.nextInt();
//         Fibonnaci(num);
//     }
// }
import java.util.Scanner;

public class qn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int first = 0;
        int second = 1;

        while (first <= limit) {
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }

        
    }
}
