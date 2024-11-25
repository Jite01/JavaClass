import java.util.Scanner;
import java.util.Arrays;
public class ArrayElementPointer {
	public static int ArrayElement(int[] demoArray, value ) {
	String result;
	for (int pointer : demoArray) 
	result = (pointer == num)? "Number is found" : "Number is not found"; 
	return result;
		}


	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("what num u searching for?\nnum: ");
	int value = scanner.nextInt();
	
	int[] array = {1, 3, 6, 64, 70, 9, 2, 0};
	ArrayElementPointer(array, value);
	}

}