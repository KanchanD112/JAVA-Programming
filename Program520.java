import java.util.*;

class Program507
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        System.out.println("Enter the word that we want to search :");
        String word = sobj.nextLine();

         word = word.trim();
        str = str.trim();

        str = str.replaceAll("\\s+"," ");
        

        String Arr[]= str.split(" ");
        
       
        int iCnt=0;
        int iFreqency =0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
             if(word.equals(Arr[iCnt]))
             {
                iFreqency++;
             }
           
        }
 System.out.println("frequency of word is :"+iFreqency);

       
    }
    
}
      