import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Mark = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter the percent of Mark : ");
        Mark = sobj.nextInt();

        System.out.println("Enter the percent of Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter the Family Income : ");
        Income = sobj.nextInt();

        if(Mark < 0 || Mark > 100)
        {
            System.out.println("Marks and attendance must be 0–100");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Mark < 80)
        {
            System.out.println("Scholarship Rejected : Marks are below 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance is below 75%");
        }
        else if(Income < 300000)
        {
            System.out.println("Scholarship Rejected : Income are below 300000");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }

        sobj.close();
    }
}