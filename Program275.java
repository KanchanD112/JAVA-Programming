//accept number from user and off the 4th bit
import java.util.*;
class Program275
{
    
        public static int OFFBit(int iNo)
        {
 
        int iMask = 0x0000008;
        int iResult = 0;
        
        iResult = iNo & iMask;


        if(iResult == iMask)   //4th bit is on
        {
            return (iNo ^ iMask);
        }
        else   //4th bit is off
        {
            return iNo;
        }
        }
 public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo=0;
        int iRet = 0;
        

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

       iRet =  OFFBit(iNo);

         System.out.println("Updated number is :"+iRet);
       
       
    }
}
