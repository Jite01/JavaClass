import java.util.Scanner;

public class  WeekDays{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number between 1 to 7: ");
		    int number = input.nextInt();
		if(number == 1){
		   System.out.print("The day is Monday: ");
		}
		if (number == 2){
		   System.out.print("The day is Tuesday: ");
		}
		if (number == 3){
		   System.out.print("The day is Wednesday: ");
		}
		if (number == 4){
		   System.out.print("The day is Thursday: ");
		}
		if (number == 5){
		   System.out.print("The day is Friday: ");
		}
		if (number == 6){
		   System.out.print("The day is Saturday: ");
		}
		if (number == 7){
		   System.out.print("The day is Sunday: ");
		}
	}
}