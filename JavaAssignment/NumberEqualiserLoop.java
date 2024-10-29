import java.util.Scanner;

public class NumberEqualiserLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be compared: ");
        int number1 = scanner.nextInt();
        int number;
        int conditionFailed = 0;

        do {
            System.out.println("Enter another number? A zero (0) input will end program");
            number = scanner.nextInt();
            if (number1 != number && number != 0) {
                conditionFailed++;
            }
        } while (number != 0);

        if (conditionFailed > 0) {
            System.out.println("The numbers aren't equal");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}