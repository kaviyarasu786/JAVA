import java.util.Scanner;
class test2
{
public static void main(String[]args)
{
System.out.print("enter the first value:");
Scanner op=new Scanner(System.in);
int a=op.nextInt();

System.out.print("enter the secound value:");
Scanner ms=new Scanner(System.in);
int b=ms.nextInt();
int c=a+b;
int d=a*b;
int e=a/b;
int f=a-b;
System.out.println("The addiction value is="+c);
System.out.println("The multiplication value is="+d);
System.out.println("The division value is="+e);
System.out.println("The subraction value is="+f);
}
}

