import java.util.*;

class Program261
{
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter your name :");
        String name= sobj.nextLine();

        char Arr[]=name.toCharArray();   

        int i=0;
        System.out.println("Array length is :"+Arr.length);      //length property  
        System.out.println("Array length is :"+name.length);     //length method

    }
}