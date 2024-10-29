import java.util.Scanner;

public class NumberRanger0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to be compared: ");
        int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
        int number;
	int maximumNumber = Math.max(number1, number2);
	int minimumNumber = Math.min(number1, number2);
        do {
            System.out.println("Enter another number? A zero (0) input will end program");
            number = scanner.nextInt();
            if (number > maximumNumber) {
                maximumNumber = number;
            }
	     if (number < minimumNumber) {
                minimumNumber = number;
            }

        } while (number != 0);

   	  System.out.printf("The maximum number is %d%n", maximumNumber);
        
          System.out.printf("The minimum number is %d", minimumNumber);
        
    }
}