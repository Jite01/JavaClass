import java.util.Scanner;
//Importing Class Scanner in java's utility package 
	public class Palindrome {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a three digit number broski: ");
		int usernum = scanner.nextInt();
		int first_number = usernum / 100;
		int third_number = usernum % 10;
		int second_number = (usernum / 10) % 10;
		if (first_number == third_number) {
		System.out.println("Yay! Your input is a palindrome");
		}
		else {
		System.out.println("Boo! Your input is not a palindrome");
		}
	 }
    }
		
		