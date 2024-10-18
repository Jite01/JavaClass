	import java.util.Scanner;
/** Importing Class Scanner in java's utility package */
	public class FeetConvert {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); //constructor opens a path into java's standard input stream.
		System.out.print("Enter number in feet: ");
		double numFeet = scanner.nextDouble();/* using datatype double for accuracy */
		double constant = 0.305;
		double result = numFeet * constant;
		System.out.printf("The number is %.2f in meter%n", result);
	     }
   	}
		