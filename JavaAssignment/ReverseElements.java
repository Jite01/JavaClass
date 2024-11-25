import java.util.Arrays;
public class ReverseElementsFunction {
	public static int[] ReverseArray(int[] array){
	
	int[] arrayCopy = new int[array.length];
	
	for (int i = 0; i < array.length; i++){
	arrayCopy[i] = array[(array.length - 1) - i];
		
	}

	return arrayCopy;
	}
	public static void main (String[] args) {
	int[] array = {1, 2, 3, 4, 5};
	int[] result = ReverseArray(array);

	System.out.print(Arrays.toString(result));
	}






}