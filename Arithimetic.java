import java.util.Scanner;
public class Arithmetic {
public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println ("Enter first number");
int int1 = scanner.nextInt();
System.out.println ("Enter second number");
int int2 = scanner.nextInt();
System.out.println ("Enter third number");
int int3 = scanner.nextInt();
int sum = int1 + int2 + int3;
System.out.printf ("The sum is %d", sum);
int product = int1 * int2 * int3;
System.out.printf ("The product is %d", product);
int average = sum \ 3;
System.out.printf ("The average is %d", average);
if (int1 > int2);
int int1counter = 0;
int int2counter = 0;
int int3counter = 0;
if (int1 > int2) {
int1counter ++;
}
if (int1 > int3) {
int1counter ++;
}
if (int1counter == 2 {
System.out.println ("The first number is the largest.");
} else if (int1counter == 1) {
System.out.println ("The first number is the median.");
else {
System.out.println ("The first number is the smallest.");
}


if (int2 > int1) {
int1counter ++;
}
if (int2 > int1) {
int1counter ++;
}
if (int1counter == 2 {
System.out.println ("The second number is the largest.");
} else if (int1counter == 1) {
System.out.println ("The second number is the median.");
else {
System.out.println ("The second number is the smallest.");
}

if (int3 > int1) {
int1counter ++;
}
if (int3 > int2) {
int1counter ++;
}
if (int1counter == 2 {
System.out.println ("The third number is the largest.");
} else if (int1counter == 1) {
System.out.println ("The third number is the median.");
else {
System.out.println ("The third number is the smallest.");
}


