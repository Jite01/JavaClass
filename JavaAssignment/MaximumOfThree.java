import java.util.Scanner;
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter 3 numbers: ");
	  int number1 = scanner.nextInt();
	  int number2 = scanner.nextInt();
	  int number3 = scanner.nextInt();
	  int maximumNumber = number1;
	  if (number2 > number1) 
	  maximumNumber = number2;

	  if (number3 > number2) 
	  maximumNumber = number3;


	 System.out.printf("The maximum number is %d", maximumNumber);
	}
   }