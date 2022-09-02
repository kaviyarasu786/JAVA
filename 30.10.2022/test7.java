import java.util.Scanner;
public class test7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter your age:");
int a=sc.nextInt();
if(a>18)
{
System.out.print("you are eligible to vote");
}
else
{
System.out.print("you are not eligible to vote");
}
}
}

