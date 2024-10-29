import java.util.Scanner;
	public class NumberEqualiser {
	  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);	 	  	  	  System.out.println("Enter 3 numbers: ");
	  int number1 = scanner.nextInt();
	  int number2 = scanner.nextInt();
	  int number3 = scanner.nextInt();

	  if (number1 == number2 && number1 == number3) {
	  System.out.print("Yay.... all numbers are equal.");
}

	  else {
	  System.out.print("Boo!!.... the numbers are not equal.");
}
	}
   }