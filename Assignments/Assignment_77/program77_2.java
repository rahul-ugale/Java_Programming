import java.util.*;

class program77_2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Distance : ");
        int Distance = sobj.nextInt();  
        
        System.out.println("Enter Booking Class Type : (Sleeper/3AC/2AC)");
        String ClassType = sobj.next();

        System.out.println("Enter Booking Hourse Before : ");
        int BookingHourse = sobj.nextInt();

        System.out.println("Enter Your Age : ");
        int Age = sobj.nextInt();

        int BaseFare = 0;

        if(Distance <= 100)
        {
            BaseFare = 100;
        }
        else if(Distance <= 500)
        {
            BaseFare = 300;
        }
        else
        {
            BaseFare = 500;
        }

        int ClassPrise = 0;

        if(ClassType.equalsIgnoreCase("Sleeper"))
        {
            ClassPrise = 0;
        }
        else if(ClassType.equalsIgnoreCase("3AC"))
        {
            ClassPrise = 500;
        }
        else if(ClassType.equalsIgnoreCase("2AC"))
        {
            ClassPrise = 1000;
        }
        else
        {
            System.out.println("Invalid Class Type!");
            return;            
        }

        int Fare = BaseFare + ClassPrise;

        double TatkalBook = 0;
        if(BookingHourse < 24)
        {
            TatkalBook = Fare * 0.30;
            Fare += TatkalBook;
        }
 
        double Citizen = 0;
        if(Age >= 65)
        {
            Citizen = Fare * 0.40;
            Fare -= Citizen;
        }

        System.out.println("------- Fare Breakdown -----");
        System.out.println("Base Fare          : " +BaseFare);
        System.out.println("Class Charge       : " +ClassPrise);
        System.out.println("Tatkal Charge      : " +TatkalBook);
        System.out.println("Senior Discount    : -" +Citizen);
        System.out.println("----------------------------");
        System.out.println("Final Fare         : " + Fare);

        sobj.close();
    }
}