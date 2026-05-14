import java.util.*;

class program621
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No = 0;
        int iDigit = 0;
        int iCount = 0;

        System.out.println("Enter the Number : ");
        No = sobj.nextInt();

        while(No != 0)
        {
            iDigit = No % 2;
            iCount = iCount + iDigit;
            No = No / 2;
        }

        System.out.print("Number of 1's are : "+iCount);
    }
}
 