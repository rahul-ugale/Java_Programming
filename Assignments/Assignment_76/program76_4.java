import java.util.*;

class program74_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Budget Amount : ");
        int Budget_Amount = sobj.nextInt();

        System.out.println("Enter number of items : ");
        int N = sobj.nextInt();

        if(Budget_Amount < 0)
        {
            System.out.println("Invalid Budget");
            return;            
        }

        if(N < 0)
        {
            System.out.println("Invalid number of items");
            return;
        }

        int Price[] = new int[N];

        int i = 0;

        for(i = 0; i < N; i++)
        {
            System.out.print("Enter price of item "+(i + 1)+": ");
            Price[i] = sobj.nextInt();

            if(Price[i] <= 0)
            {
                System.out.println("Invalid item price");
                return;                
            }
        }

        int Count = 0;
        int Remaining = Budget_Amount;

        for (i = 0; i < Price.length; i++) 
        {
            if (Remaining < Price[i]) 
            {
                break;
            }

            Remaining -= Price[i];
            Count++;
        }

        System.out.println("Items Purchased : "+Count);
        System.out.println("Remaining Balance : "+Remaining);        

        sobj.close();
    }
}