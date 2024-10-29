import java.util.Scanner;

public class FloatCompare {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Input floating-point number: ");
       float num1 = scanner.nextFloat();
       
       System.out.print("Input floating-point another number: ");
       float num2 = scanner.nextFloat();
       
       num1 = Math.round(num1 * 1000.0f) / 1000.0f;
       num2 = Math.round(num2 * 1000.0f) / 1000.0f;
       
       if (num1 == num2) {
           System.out.println("They are the same up to three decimal places");
       } else {
           System.out.println("They are different");
       }
       
       
   }
}