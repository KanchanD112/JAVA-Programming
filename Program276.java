//accept number from user and off the 11th bit
import java.util.*;
class Program276
{
    
        public static int OFFBit(int iNo)
        {
 
        int iMask = 0x00000400;
        int iResult = 0;
        
        iResult = iNo & iMask;


        if(iResult == iMask)   //11th bit is on
        {
            return (iNo ^ iMask);
        }
        else   //11th bit is off
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
