import java.io.*;
class Writefile
{
public static void main(String arg[]) throws Exception
{
    try
    {
    String Data = "Marvellous Infosystem";
    byte Arr[] = Data.getBytes();
    FileOutputStream fobj = new FileOutputStream("PPA.txt");
    fobj.write(Arr);
    }
    catch(Exception obj)
    {}
}


}