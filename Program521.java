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
        

        str =str.replaceAll(word,"");

        str=str.trim();
        str = str.replaceAll("\\s+"," ");
        System.out.println("updated string is: "+str);
    }
    
}
      