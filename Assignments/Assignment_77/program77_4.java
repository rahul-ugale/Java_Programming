import java.util.*;

class program77_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Units : ");
        int Units = sobj.nextInt();

        System.out.println("Enter Week Late : ");
        int WeekLate = sobj.nextInt();

        double Bill_Amount = 0;

        if(Units <= 100)
        {
            Bill_Amount = Units * 5;
        }
        else if(Units <= 300)
        {
            Bill_Amount = (100 * 5) + ((Units - 100) * 8);
        }
        else
        {
            Bill_Amount = (100 * 5) + (200 * 8) +  ((Units - 300) * 12);
        }

        Bill_Amount = Bill_Amount + 100;

        double LatePay = WeekLate * 0.02;

        if(LatePay > 0.10)
        {
            LatePay = 0.10;
        }

        double Penatly = Bill_Amount * LatePay;

        Bill_Amount = Bill_Amount + Penatly;

        System.out.println("Final Water Bill Amount : " +Bill_Amount);

        sobj.close();
    }
}