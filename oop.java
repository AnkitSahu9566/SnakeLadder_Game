class A
{
 static int x,y;
 void get(int x,int y)
{
this.x=x;
this.y=y; 
}
void show()
{System.out.println("x="+x);
System.out.println("y="+y);
}
}
class oop
{
public static void main(String a[])

{
 A a=new A();
a.get(10,25);
a.show();}
}