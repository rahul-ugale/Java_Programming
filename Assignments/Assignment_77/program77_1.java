import java.util.*;

class program77_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Hospitial Day : ");
        int Days = sobj.nextInt();

        System.out.println("Enter Ward Type : (Normal/ICU)");
        String WardType = sobj.next();

        System.out.println("Enter Your Medicien Bill : ");
        int MedicienBill = sobj.nextInt();

        System.out.println("Enter Your Total Consultation Fee : ");
        int ConsultationFee = sobj.nextInt();        

        System.out.println("Insurance Are Avlible : (Yes/NO)");
        String  Insurance = sobj.next(); 

        if(Days < 0 || MedicienBill < 0 || ConsultationFee < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Insurance.equalsIgnoreCase("Yes") == false && Insurance.equalsIgnoreCase("No") == false)
        {
            System.out.println("Invalid Insurance type! Must be Normal or ICU.");
            return;
        }

        int RoomChargePerDay = 0;

        if(WardType.equalsIgnoreCase("Normal"))
        {
            RoomChargePerDay = 2000;
        }
        else if(WardType.equalsIgnoreCase("ICU"))
        {
            RoomChargePerDay = 5000;
        }
        else
        {
            System.out.println("Invalid ward type! Must be Normal or ICU.");
            return;
        }

        int RoomCharges =  Days * RoomChargePerDay;

        int TotalBill = RoomCharges + MedicienBill + ConsultationFee; 

        double IncuranceCover = 0;

        if(Insurance.equalsIgnoreCase("Yes"))
        {
            IncuranceCover = TotalBill * 0.70;      
        }

        double FinalPay  = TotalBill - IncuranceCover;

        System.out.println("----- Bill Details -----");
        System.out.println("Total Bill : "+TotalBill);
        System.out.println("Insurance Cover : " +IncuranceCover);
        System.out.println("Final Amount to Pay : " +FinalPay);        
        
        sobj.close();
    }
}