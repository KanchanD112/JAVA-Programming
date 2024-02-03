
import java.util.*;

class Program245
{
   public static void EvenFactors(int iNo)
   {
     int iCnt = 0;
     int iFact = 1;
     for(iCnt = 1; iCnt<= iNo; iCnt++)

     {
        if((iNo % iCnt) == 0)
        {
            if((iCnt %2)==0)
            {
                System.out.println("Even factor is : "+iCnt);
            }
        }
        
       
     }
   }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
       int iValue = 0;

       System.out.println("Enter number : ");
       iValue = sobj.nextInt();

       EvenFactors(iValue);

       
        sobj.close();

    }
}





    