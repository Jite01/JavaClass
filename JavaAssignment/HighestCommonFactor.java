import java.util.Scanner;
	public class ReverseMultiplicationTable {
		public static void main(String[] args) {

	System.out.print("Enter number 2/n Number 1: ");
	int value1 = scanner.nextInt();

	System.out.print("Enter number 2/n Number 2: ");
	int value2 = scanner.nextInt();

   	min_value = Math.min(value1, value2);

	max_value = Math.max(value1, value2);

	int highestCommonFactor;

	for (highestCommonFactor = 0; highestCommonFactor < max_value; highestCommonFactor++) {
		if (max_value % highestCommonFactor == 0 && highestCommonFactor < min_value) System.out.print(highestCommonFactor);
	}

