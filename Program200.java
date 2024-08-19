import java.util.*;

class Arithematic
{
    public int iNo1;
    public int iNo2;

    public Arithematic(int A, int B)
    {
        iNo1=A;
        iNo2=B;
    }

    public int Addition()
    {
        int iAns=0;
        iAns= iNo1+iNo2;

        return iAns;
    }
}

class Program200
{
    public static void main(String Args[])
    {
        Scanner sobj=new Scanner(System.in);

        int iValue1=0; 
        int iValue2=0;
        int iRet=0;

        System.out.println("enter first number :");
        iValue1=sobj.nextInt();

        System.out.println("enter second number :");
        iValue2=sobj.nextInt();

        Arithematic aobj = new Arithematic(iValue1, iValue2);

        iRet=aobj.Addition();

        System.out.println("Addition is :"+iRet);
    }
}


