class AbstractDemo1
{
public static void main(String arg[])
{
    Hello hobj = new Hello();
    hobj.fun();
    hobj.gun();
}
}


abstract class Demo
{
public int A, B;

public Demo()
{
    System.out.println("Inside Demo constructor");
    this.A = 0;
    this.B = 0;
}
abstract void fun();  //c++- virtual void fun() = 0;
void gun()
 {
  System.out.println("Inside gun of Demo");  
 }
}
class Hello extends Demo
{
public Hello()
{
    System.out.println("inside Hello constructor");
}
public void fun()
{
    System.out.println("inside fun of  Hello");
}
}

