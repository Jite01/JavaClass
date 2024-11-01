import java.util.Scanner;
	public class RandomNumberGenerator {
	  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
	  int randomNum = (int)(Math.random() * 10);
	  int counter = 0;
	  
	  while (counter <= 10000) {
	  System.out.println("Guess the number");
	  int input = scanner.nextInt();
          if ( input > randomNum ) {
         System.out.println("Pfft... too high.Try again. ");
             }
	 else if ( input == randomNum ) {
         System.out.println("Merlin..your guess is correct.");
	 break;
             }
        else{
	 System.out.print("Pfft... too low. Try again\n");
	 ++counter;
             }
	                  }
	   } 
        }
