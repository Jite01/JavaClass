import java.util.Scanner;

public class NumberEqualiserLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number to be compared: ");

        int number1 = scanner.nextInt();
        int number;
        int conditionFailed = 0;

	 System.out.println("More?\n continue(y)" + " " + " " +" " +" "+" " + " " + " " + " " + "(n)will end program");

        String nextAction = scanner.nextLine(); //hi

        while (nextAction.equalsIgnoreCase("y")) {
	System.out.println("Enter number to be compared: ");
        number = scanner.nextInt();

        if (number1 != number && number != 0) {
                conditionFailed++;
	 System.out.println("More?\n continue(y)" + " (n)will end program");
            nextAction =  scanner.nextLine(); //hi

            }
        } 
        if (conditionFailed > 0) {
            System.out.println("The numbers aren't equal");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}