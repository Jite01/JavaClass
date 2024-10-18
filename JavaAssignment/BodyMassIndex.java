import java.util.Scanner;
/** Importing Class Scanner in java's utility package */
	public class BodyMassIndex {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); //constructor opens a path into java's standard input stream.
		System.out.print("Enter your weight: ");
		double weight = scanner.nextDouble();
		if (weight < 80) {
		System.out.print("Sigh... another impoverished African kid.\nPls enter your height though: ");
		}
		if (weight > 80 &&  weight < 150) {
		System.out.print("Damn... hit the gym, fat nigga.\nPlease enter your height though: ");
		}
		if (weight > 150) {
		System.out.print("You're 1 meal away from becoming a black hole.\nPls enter your height though: ");
		}
		double height = scanner.nextDouble();
		double result = (weight * 703) / (height * height); /* data type "double" to accomodate decimals.*/
		System.out.printf("Your (BMI) body mass index is %.2f in pounds%n", result);
		}
          }