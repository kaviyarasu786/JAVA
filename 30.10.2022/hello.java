

import java.util.Scanner;


public class hello
{
public static void main(String [] args)
{
System.out.print("enter the first value :");
Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
System.out.println(x+110);
 
System.out.print("enter the secound value:");
Scanner sd = new Scanner(System.in);
int y=sd.nextInt();
int z=x+y;
System.out.print("total value is:"+z);
}
}