import java.util.Scanner;
public class MaxElementFunctionn {

  	public static int maxElement(int[] array){
	int largest = array[0];
	for ( int i : array) {
	largest = (largest < i) ? i : largest;	
	}
	return largest;

    }
	
	public static void main(String[] args){
	int[] array = {1,4,6,7,8,7,81};
	int result = maxElement(array);
	System.out.println("The largest element is: " + result);
	}
   }
