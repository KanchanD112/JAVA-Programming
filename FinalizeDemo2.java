class FinalizeDemo2
{
    public static void main(String arg[])
    {
    Employee eobj = new Employee("Amit",780000,28,"Karvenagar Pune");
    eobj.Display();
   // eobj = null;
    Employee eobj2 = eobj;

 Employee eobj3 = new Employee("sagar",88000,83,"prabhat road");
    System.out.println("Hash code of eobj is:"+eobj.hashCode());
    System.out.println("Hash code of eobj is:"+eobj2.hashCode());
    System.out.println("Hash code of eobj is:"+eobj3.hashCode());
    System.gc();   //garbage collector swtha finalize 
    }
    
}
class Employee
{
public String Name;
public int Salary;
public int Age;
public String Address;

Employee(String str, int amount, int A, String addr)
{
 this.Name = str;
 this.Salary = amount;
 this.Age = A;
 this.Address = addr;
}

protected void finalize()
{
    System.out.println("Inside Finalize method...");
}


void Display()
{
    System.out.println("Employee Name : "+this.Name);
    System.out.println("Employee Age : "+this.Age);
    System.out.println("Employee Salary : "+this.Salary);
    System.out.println("Employee Address : "+this.Address);
}
}