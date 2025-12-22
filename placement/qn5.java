import java.util.Scanner;
public class qn5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String m="";
        boolean converted=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                m=m+'*';
                converted=true;
            }
            else{
                m=m+ch;
            }
        }
        if(converted){
            System.out.println(m+ "-->vowels converted into *");
        }
        else{
            System.out.println(m+"-->No vowels found");
        }
    }
}