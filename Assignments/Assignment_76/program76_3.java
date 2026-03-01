import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Parcel_Weight = 0;
        int Charge_Amount = 0;

        System.out.println("Enter the Parcel Weight : ");
        Parcel_Weight = sobj.nextInt();

        if(Parcel_Weight <= 0)
        {
            System.out.println("Weight must be > 0");
            return;
        }

        if(Parcel_Weight <= 1)
        {
            Charge_Amount = 50;
        }
        else if(Parcel_Weight <= 5)
        {
            Charge_Amount = 50 + (Parcel_Weight - 1) * 20;
        }
        else
        {
            Charge_Amount = 150 + (Parcel_Weight - 5) * 30;
        }

        System.out.println("Parcel Weight : "+Parcel_Weight);
        System.out.println("Courier Charge : "+Charge_Amount);

        sobj.close();
    }
}