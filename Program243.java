import java.util.*;
class ArrayX
{
    public int Arr[];

    public ArrayX(int No)
    {
        Arr=new int[No];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the elements :");

        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are :");

        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public float Average()
    {
        int i=0, iSum=0;
        float fAns=0.0f;
        

         for(i=0;i<Arr.length; i++)
        {
        iSum=iSum+Arr[i];
        }
        fAns=iSum/Arr.length;

        return fAns;
        
    }
}

class Program242
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter number of elements you want to store :");
        int iNo=sobj.nextInt();

        ArrayX aobj= new ArrayX(iNo);
        System.out.println("Array size is :"+aobj.Arr.length);

        aobj.Accept();
        aobj.Display();

        float fret= aobj.Average();

        System.out.println("Average is :"+fret);

    }
}