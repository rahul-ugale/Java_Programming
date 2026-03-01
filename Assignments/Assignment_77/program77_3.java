import java.util.*;

class program77_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Usages Call : (Min)");
        int Call_Min = sobj.nextInt();

        System.out.println("Enter the Usages Data : (GB)");
        int Data_GB = sobj.nextInt();

        System.out.println("Enter the SMS : (Count)");
        int SMS_Count = sobj.nextInt();

        int PerMin = 0;
        if(Call_Min > 0)
        {
            PerMin = Call_Min * 2;
        }

        int PerGB = 0;
        if(Data_GB > 0)
        {
            PerGB = Data_GB * 10;
        }

        int PerSMS = 0;
        if(SMS_Count > 0)
        {
            PerSMS = SMS_Count * 5;
        }

        int TotalCost = PerMin + PerGB + PerSMS;

        System.out.println("Recommended Plan is : "+Call_Min+" : "+Data_GB+" : "+SMS_Count);
        System.out.println("Total Cost is : "+TotalCost);

        sobj.close();
    }
}