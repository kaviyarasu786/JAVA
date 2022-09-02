 class cartoon
{
String character;
String chennal;
float time;


void showtime(float t,String c)
{
float time=t;
String chennal=c;
System.out.println("showtime details:"+t +c);
}

void showcartoon(String ch)
{
String character=ch;
System.out.println("showcartoon:" +ch);
}

}
class mainclass
{
public static void main(String args[])
{
cartoon car=new cartoon();
car.showtime(2.2f ,"suntv");
car.showcartoon("ramesh");
}
}


