// write the program 8th bit position is ON or OF and mask will be number Hexadecimal 

import java.util.Scanner;

class program628
{
    public static void main(String A[])
    {
        int iNo = 0,iMask = 0,iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iMask = 0x00000080;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("8th bit is ON");
        }
        else
        {
            System.out.println("8th bit is OFF");
        }
    }
}
 