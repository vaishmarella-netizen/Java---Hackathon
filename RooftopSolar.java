import java.util.Scanner;
public class RooftopSolar {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following details:");
        System.out.println("Enter the panel id");
        int PanelId = sc.nextInt();
        System.out.println("Enter the energy generated in kWh");
        double Energy = sc.nextDouble();
        System.out.println("Enter the no of solar panels");
        int SolarPanels = sc.nextInt();
        System.out.println("Enter the system status");
        char status = sc.next().charAt(0);

    }
    
}
