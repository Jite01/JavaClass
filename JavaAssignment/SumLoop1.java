import java.util.Scanner;
public class SumLoop1 {
public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
int nextAction = 0;
do {
System.out.println("Enter 2 numbers chico:");
int valueA = scanner.nextInt();
int valueB = scanner.nextInt();
int result = valueA + valueB;
System.out.printf("Sum is %d, chico%n", result);
System.out.printf("Another time chico?%n%nPress 0 to quit or 1 to continue:%n");
nextAction = scanner.nextInt();
}
while (nextAction == 1);
if (nextAction != 0 && nextAction != 1 ) {
System.out.print("Invalid input. Program has ended");
return; 
 }
else {
System.out.print("See you Later!");
    }
        }
    }