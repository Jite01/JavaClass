import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int int1 = scanner.nextInt();
        System.out.println("Enter second number");
        int int2 = scanner.nextInt();
        System.out.println("Enter third number");
        int int3 = scanner.nextInt();
        
        int sum = int1 + int2 + int3;
        System.out.printf("The sum is %d%n", sum);
        
        int product = int1 * int2 * int3;
        System.out.printf("The product is %d%n", product);
        
        double average = sum / 3;
        System.out.printf("The average is %.2f%n", average);
        
           if (int1 >= int2 && int1 >= int3) {
            System.out.println("The first number is the largest.");
            if (int2 >= int3) {
                System.out.println("The second number is the median.");
                System.out.println("The third number is the smallest.");
            } else {
                System.out.println("The third number is the median.");
                System.out.println("The second number is the smallest.");
            }
        } else if (int2 >= int1 && int2 >= int3) {
            System.out.println("The second number is the largest.");
            if (int1 >= int3) {
                System.out.println("The first number is the median.");
                System.out.println("The third number is the smallest.");
            } else {
                System.out.println("The third number is the median.");
                System.out.println("The first number is the smallest.");
            }
        } else {
            System.out.println("The third number is the largest.");
            if (int1 >= int2) {
                System.out.println("The first number is the median.");
                System.out.println("The second number is the smallest.");
            } else {
                System.out.println("The second number is the median.");
                System.out.println("The first number is the smallest.");
            }
        }
        
      }
 }  