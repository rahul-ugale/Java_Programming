import java.util.*;

class program76_1
{
    public static void main(String A[])
    {
         Scanner sobj = new Scanner(System.in);

         int Distance_KM = 0;
         double Base_Fare = 0;

         String Peak_Hours = null;

         System.out.println("Enter Your Distance KM");
         Distance_KM = sobj.nextInt();

         System.out.println("Peak hour : (Yes/No)");
         Peak_Hours = sobj.next();

         if(Distance_KM < 0)
         {
               System.out.println("Distance cannot be negative");
               return;
         }

         if(Peak_Hours.equalsIgnoreCase("Yes") == false && Peak_Hours.equalsIgnoreCase("Yes") == false)
         {
               System.out.println("Peak hour : (Yes/No)");
               return;
         }

         Base_Fare = 50;

         if(Distance_KM <= 10)
         {
               Base_Fare = Base_Fare + (Distance_KM * 12);
         }
         else
         {
               Base_Fare = Base_Fare + (10 * 12);
               Base_Fare = Base_Fare + (Distance_KM - 10) * 15;
         }

         if(Peak_Hours.equalsIgnoreCase("Yes"))
         {
               Base_Fare = Base_Fare + (Base_Fare * 0.20);
         }

        System.out.println("Distance : " + Distance_KM + " km");
        System.out.println("Peak Hour : " + Peak_Hours);
        System.out.println("Total Fare : " + Base_Fare);

        sobj.close();
    }
}