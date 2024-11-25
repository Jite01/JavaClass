import java.util.Arrays;
import java.util.Scanner;


public class ArrayDuplicate {
	public static void main (String... args){
		int[] testArray = {1, 1, 3, 4, 6, 9, 7, 9};
		for (int i = 0; i < testArray.length; i++){
			for (int j = 1; j < testArray.length; j++){
				if (testArray[i] == testArray[j])System.out.print(i + " repeats at index " + j);
				}
				System.out.printf("%n");
				}
		





}
}