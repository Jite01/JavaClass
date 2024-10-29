import java.util.Scanner;
public class SumLoop {
public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 2 numbers chico:");
int valueA = scanner.nextInt();
int valueB = scanner.nextInt();
int result = valueA + valueB;
System.out.printf("Sum is %d, chico%n", result
);
System.out.printf("Another time chico?%n%nPress 0 to quit or 1 to continue:%n");
int nextAction = scanner.nextInt();
if (nextAction != 0 && nextAction !=1 ) {
System.out.print("Invalid input. Program has ended");
return; 
 }
if (nextAction == 0) {
System.out.print("See you Later!");
return;
 }
int nextAction2 = 0;
do {
System.out.println("Enter 2 numbers chico:");
int valueC = scanner.nextInt();
int valueD = scanner.nextInt();
int result2 = valueC + valueD;
System.out.printf("Sum is %d, chico%n", result2);
System.out.printf("Another time chico?%n%nPress 0 to quit or 1 to continue:%n");
nextAction2 = scanner.nextInt();
}
while (nextAction2 == 1);
if (nextAction2 != 0 && nextAction2 !=1 ) {
System.out.print("Invalid input. Program has ended");
return; 
 }
if (nextAction2 == 0) {
System.out.print("See you Later!");
return;
    }
        }
    }