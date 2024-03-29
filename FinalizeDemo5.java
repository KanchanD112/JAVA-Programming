class FinalizeDemo5
{
    public static void main(String arg[]) throws Exception
    {
        
    
        Employee eobj1 = new Employee("Amit",780000,28,"Karvenagar Pune");
       
        System.out.println(eobj1);  // it calls toString method internally
       
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
public String toString()
{
    return Name+" "+Salary+" "+Age+" "+Address;
}
}