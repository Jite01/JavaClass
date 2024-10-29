import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i <= 3; i++) {
            System.out.print("Enter citizen " + i + " name: ");
            String name = input.nextLine();
            
            System.out.print("Enter " + name + "'s yearly earnings (USD): ");
            double earnings = input.nextDouble();
            input.nextLine();             
            double tax = 0;
            
            if(earnings <= 30000) {
                tax = earnings * 0.15;
            } else if (earnings > 30000) {
                tax = earnings * 0.20;
            }
            
            System.out.println(name + " total tax: amount of tax is " + tax);
            System.out.println();
        }
        
    }
}