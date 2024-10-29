import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number:");
      int number = scanner.nextInt();	         
        for(int i = 0; i <= 5; i++) {
            int result = number * i;
             System.out.println(number + " X " + i + " = " + result);
        }
    }
}