import java.util.Scanner;
public class test9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter your mark:");
int mark=sc.nextInt();
if(mark<35)
{
System.out.println("faill");
}
else if(mark >=35 && mark<=60)
{
System.out.println("C grade");
}
else if(mark>60 && mark<=80)
{
System.out.println("B grade");
}
else if(mark>80 && mark<=100)
{
System.out.println("A grade");
}

}
}
