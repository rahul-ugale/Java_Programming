import java.util.*;

class program74_6
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Battery Percentage : ");
        int Percentage = sobj.nextInt();

        if(Percentage < 0 || Percentage > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        String Status = null;

        if(Percentage <= 5)
        {
            Percentage = Percentage;
            Status = "Critical";
        }
        else if(Percentage <= 15)
        {
            Percentage = Percentage;
            Status = "Low";           
        }
        else
        {
            Percentage = Percentage;
            Status = "Normal";
        }

        System.out.println("Battery Percentage : "+Percentage+"%");
        System.out.println("Status : "+Status);

        sobj.close();
    }
}