public class MinElement {
	public static void main(String[] args){
	
	int[] array = {1, 5, 2, 8, 3};
	int smallest = array[0];
		
	for ( int pointer : array) {
	smallest = (pointer < smallest) ?  pointer: smallest;
	}

	System.out.println("The largest element is: " + smallest);

	}
}