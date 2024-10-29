import java.util.Scanner;
public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int nextAction;
do {
	System.out.print("Enter a number: ");
	  int number1 = scanner.nextInt();
	 if (number1 > 0) {
System.out.printf("The input %d is a positive number%n", number1);
}
	else if (number1 < 0 ) {
System.out.printf("The input %d is a negative number%n", number1);
}
	else {
System.out.printf("The input %d is a zero%n", number1);
}
System.out.println("Enter 1 to repeat...... Enter 0 to quit\n");
	nextAction = scanner.nextInt();
if (nextAction == 0) {
break;
}
if (nextAction != 0 && nextAction != 1 ) {
System.out.print("Invalid input.");
}

}
while (nextAction == 1);




	}
   }