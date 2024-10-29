import java.util.Scanner;

public class NumberRanger0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to be compared: ");
        int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
        int number;
        int maximumNumber = number1;
	int minimumNumber = number2;
        do {
            System.out.println("Enter another number? A zero (0) input will end program");
            number = scanner.nextInt();
            if (number > number1) {
                maximumNumber = number;
            }
	     if (number < number2) {
                minimumNumber = number;
            }

        } while (number != 0);

   	  System.out.printf("The maximum number is %d%n", maximumNumber);
        
          System.out.printf("The minimum number is %d", minimumNumber);
        
    }
}