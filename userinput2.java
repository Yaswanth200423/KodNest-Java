import java.util.Scanner;
public class userinput2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Engter the age:");
        int age=s.nextInt();
        System.out.println("age is:"+age);
        System.out.println("enter the height");
        float height=s.nextFloat();
        System.out.println("height is:"+height);
        s.nextLine();
        System.out.println("Enter your full name:");
        String fname=s.nextLine();
        System.out.println("full name is:"+fname);
    }
}