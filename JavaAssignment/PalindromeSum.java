import java.util.Scanner;
/** Importing Class Scanner in java's utility package */
	public class PalindromeSum {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a three digit number broski: ");
		int usernum = scanner.nextInt();
		int first_number = usernum / 100;
		int third_number = usernum % 10;
		int second_number = (usernum / 10) % 10;
		int result = first_number + second_number + third_number;
		System.out.printf("The sum of the digits is %d%n", result);
	}
   }

		
		
		