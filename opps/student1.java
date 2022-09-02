class student1
{
int id;
String name;
int age;
}


class teststudent
{
public static void main(String args[])
{
student1 s1=new student1();
student1 s2=new student1();
student1 s3=new student1();
s1.id=1;
s1.name="ramesh";
s1.age=22;

s2.id=2;
s2.name="semu";
s2.age=32;

s3.id=3;
s3.name="raj";
s3.age=11;

System.out.println(s1.id+" "+s1.name+" "+s1.age);
System.out.println(s2.id+" "+s2.name+" "+s2.age);
System.out.println(s3.id+" "+s3.name+" "+s3.age);

}
}
