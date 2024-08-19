//count number on digits
import java.util.*;


class Program209
{
    public static int SumEvenDigits(int iNo)
    {
        int iCnt=0;
        int iDigits=0;
        iSum=0;

        while(iNo>0)
        {
            iDigits=iNo%10;
            if((iDigits%2)==0)
            {
                iSum=iSum+iDigits;
            }
            iNo=iNo/10;
        }
        return iCnt;
        
    }

 

    public static void main(String Args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0, iRet=0;

        System.out.println("enter number :");
        iValue=sobj.nextInt();

        iRet=SumEvenDigits(iValue);

        System.out.println("Number of digits are :"+iRet);
    }
}


