import java.util.Scanner;
	public class DualInputComparator {
  	  public static void main (String[] args) {
           Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number one: ");
  	    int input1 = scanner.nextInt();

	    System.out.print("Enter number two: ");
  	    int input2 = scanner.nextInt();

	  System.out.println(input1 > input2 ? "greater" : "you're a doing well");
	    int value = 50;
	    int sum = input1 + input2;

	   System.out.println(sum > value ? "Sum is greater" : "Value is greater");     
		  }
             }