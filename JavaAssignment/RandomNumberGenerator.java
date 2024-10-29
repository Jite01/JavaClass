import java.util.Scanner;
	public class RandomNumberGenerator {
	  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
	  int randomNum = (int)(Math.random() * 10);
	 
	  while (input == randomNum) {
          System.out.println("Guess the number?");
	  input = scanner.nextInt();
	  if ( input > randomNum ) System.out.print("Too high.Try again");
	  if ( input < randomNum ) System.out.print("Too high.Try again");

	}
	  
}
}