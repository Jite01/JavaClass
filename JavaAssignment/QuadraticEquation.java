import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        System.out.print("Input a: ");
        double a = input.nextDouble();
        
        System.out.print("Input b: ");
        double b = input.nextDouble();
        
        System.out.print("Input c: ");
        double c = input.nextDouble();
	
	double squaredValues = b * b - 4 * a * c;
        
        if (squaredValues > 0) {
            double answer = (-b + Math.sqrt(squaredValues)) / (2 * a);
	System.out.printf("Answer is %.3f", answer);
		}
	else { 
	double answer2 = (-b - Math.sqrt(squaredValues)) / (2 * a);
	System.out.printf("Answer is %.3f", answer2);
	       }
	}
    }
