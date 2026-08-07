import java.util.Scanner;
public class userinput{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Byte value:");
    byte a=s.nextByte();
    System.out.println("Byte value is"+a);
    System.out.println("Enter the short value:");
    short b=s.nextShort();
    System.out.println("short value is"+b);
    System.out.println("enter the int value");
    int c=s.nextInt();
    System.out.println("int value is"+c);
    System.out.println("Enter the long value:");
    long d=s.nextLong();
    System.out.println("long value is "+d);
    System.out.println("Enter the float value:");
    float e=s.nextFloat();
    System.out.println("float value is"+e);
    System.out.println("Enter the Double value:");
    double f=s.nextDouble();
    System.out.println("double value is"+f);
    System.out.println("Enter the boolean value:");
    boolean g=s.nextBoolean();
    System.out.println("boolean value is"+g);
}
}