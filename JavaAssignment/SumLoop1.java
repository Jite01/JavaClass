import java.util.Scanner;
public class SumLoop1 {
public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
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
if (nextAction2 != 0 && nextAction2 != 1 ) {
System.out.print("Invalid input. Program has ended");
return; 
 }
else {
System.out.print("See you Later!");
    }
        }
    }