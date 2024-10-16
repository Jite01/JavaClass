import java.util.Scanner;

	public class Conversion212 {
		public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number in feet: ");
		int number1 = input.nextInt();
		double constant = 0.305;

		double result = number1 * constant;
		System.out.print ("The number in meters is " + result);
		}
	}