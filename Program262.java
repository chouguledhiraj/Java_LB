//find number of capital character
import java.util.*;

class Program262
{
    public static int CountCapital(String str)
    {
        char Arr[]=str.toCharArray();
        int iCount = 0, i=0;
        for (i = 0; i < str.length(); i++) 
        {
            if (Arr[i]>='A'&& Arr[i]<='Z') 
            {
                iCount++;
            }
        }
        return iCount;
    }
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter your name :");
        String name= sobj.nextLine();

        int iRet=0;
        iRet=CountCapital(name);

        System.out.println("number of capital character are :"+iRet);     

    }
}