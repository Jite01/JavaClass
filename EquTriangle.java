import java.util.Scanner;

public class EquTriangle {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println ("I am WAN SHAI LU. What's your name?");
	String name = scanner.nextLine();
	System.out.printf ("Enter length of sides of our equilateral triangle %s%n ", name);
	int length = scanner.nextInt();
	double constant = 0.4330;
	double area = constant * (length * length);
	double volume = area * length;
	System.out.printf ("The area is %.3f%nThe volume is %.3f", area,volume);
	}
    }
