import java.util.Scanner;

	public class Conversion {
		public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number in pounds: ");
		int number1 = input.nextInt();
		double constant = 0.454;

		double result = number1 * constant;
		System.out.print ("The number in kilograms is " + result );
		}
	}