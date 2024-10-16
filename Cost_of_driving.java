import java.util.Scanner;
	public class Cost_of_driving {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the driving distance:");
		float drivingdistance = input.nextFloat();
		System.out.println ("Enter miles per gallon:");
		float miles = input.nextFloat();
		System.out.println ("Enter price per gallon:");
		float price = input.nextFloat();
		float result = (drivingdistance / miles) * price;
	System.out.println ("The cost of driving is " + result);

	}
}