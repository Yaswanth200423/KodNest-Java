import java.util.Scanner;
public class userinput3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter char:");
        char ch=s.next().charAt(2);
        System.out.println(ch);
    }
}