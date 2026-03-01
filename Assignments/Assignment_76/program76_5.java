import java.util.*;

class program74_5
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

        if(Percentage <= 5)
        {
            System.out.println("Battery Percentage : "+Percentage+"%");
            System.out.println("Status :  Critical");
        }
        else if(Percentage <= 15)
        {
            System.out.println("Battery Percentage : "+Percentage+"%");
            System.out.println("Status : Low");            
        }
        else
        {
            System.out.println("Battery Percentage : "+Percentage+"%");
            System.out.println("Status : Normal");
        }

        sobj.close();
    }
}