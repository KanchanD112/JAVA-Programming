class Marvellous
{

public int i;
public int j;

public Marvellous()
{
System.out.println("Inside default constructor");
this.i;
this.j;
}
public Marvellous(int a,int b)
{
System.out.println("Inside parameterised constructor");
}
public void Fun()
{
    System.out.println("Inside Fun method");
}
}

class ClassDemo
{

    public static void main(String arg[])
    {
        System.out.println("Inside main");

    marvellous mobj1 = new Marvellous();  //Defult constructor
    marvellous mobj2 = new Marvellous(11,21); //Parameterised constructor
    marvellous.out.println(mobj2.i); //11
    marvellous.out.println(mobj2.j);
   mobj2.fun();
    }
}