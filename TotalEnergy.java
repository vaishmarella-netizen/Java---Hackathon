import java.util.Scanner;
public class TotalEnergy {
    double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
  
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the morning energy in kWh");
        Double morningEnergy = sc.nextDouble();
        System.out.println("Enter the evening energy is kWh");
        Double eveningEnergy = sc.nextDouble();
        TotalEnergy energy = new TotalEnergy();
        double EnergyGenerated = energy.calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated is:" + EnergyGenerated + "kWh");
    
}
}
