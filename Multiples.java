import java.util.Scanner;

     public class Multiples {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println ("Enter first integer");
 	int int1 = scanner.nextInt();
	int int1tripled = 3 * int1;
	System.out.println ("Enter second integer");
	int int2 = scanner.nextInt();
	int int2doubled = 2 * int2;
	if (int1tripled % int2doubled == 0) {
	System.out.printf("Integer 1 tripled  doubled (%d) is a multiple of Integer 2(%d)%n", int1tripled, int2doubled);
	}
	else {
	System.out.printf("Integer 1 tripled (%d) is not a multiple of Integer 2 doubled (%d)%n", int1tripled, int2doubled);
	 }
	scanner.close();
       }
     }
  
	
	
