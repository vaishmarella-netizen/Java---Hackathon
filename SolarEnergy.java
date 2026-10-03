import java.util.Scanner;
public class SolarEnergy {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the energy generated in kWh");
        int Energy = sc.nextInt();
        if (Energy >= 10) {

            System.out.println("Good Energy Generation");
        }
        else {
            System.out.println("Low Energy Generation");
        }

        
        

    }
    
}
