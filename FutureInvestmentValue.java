import java.util.Scanner;
	public class FutureInvestmentValue {
	  public static void main (String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter investment amount");
	  double invAmount = scanner.nextDouble();
	  System.out.print("Enter annual interest rate: ");
	  double annualIntRate = scanner.nextDouble();
	  System.out.println ("Enter number of years: ");
	  int numOfYears = scanner.nextDouble();
	  double result = invAmount * (1 + annualIntRate) Math.pow(numOfYears * 12);
