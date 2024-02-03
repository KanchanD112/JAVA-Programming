import java.util.*;
class Program385
{
    public static void main(String Arg[])
    {
      Scanner sobj = new Scanner(System.in);
      int iRow = 0; int iCol = 0;

      System.out.println("Enter number of rows : ");
      iRow = sobj.nextInt();

      System.out.println("Enter number of Columns : ");
      iCol = sobj.nextInt();

       int Arr[][] = new int[iRow][iCol];
       
       int i=0; int j=0;
       System.out.println("Enter the elements : ");

       //    1      2      3
       for( i =0; i<iRow; i++)//outer
       {
          //  1    2     3
        for(j= 0;j<iCol;j++)  //inner
        {
            Arr[i][j] = sobj.nextInt(); //4
        }
       }
   Matrix mobj =new Matrix();  //matrix cha obj kela
   mobj.Display(Arr);
   int iRet=0;

   iRet = mobj.Summation(Arr);
   System.out.println("Addition of all elements is :"+iRet);
}
}
class Matrix
{
     public void Display(int Arr[][])
    {

       int i=0, j=0; 
    System.out.println("Entered elements are :");
    for(i =0; i < Arr.length; i++)
       {
        for( j= 0;j < Arr[i].length;j++)
        {
            System.out.print(Arr[i][j]+"\t");
        
        }
        System.out.println();
    }
    }

    public  int Summation(int Arr[][])
    {

    int i=0, j=0,iSum=0;
    
    for(i =0; i < Arr.length; i++)
       {
        for( j= 0;j < Arr[i].length;j++)
        {
        iSum = iSum+Arr[i][j];
        
        }
       
    }
    return iSum;
    }
}
