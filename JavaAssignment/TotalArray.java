public class TotalArray {
	public static void main(String[] args){
	
	int[] array = {1, 5, 2, 8, 3};
	int sum = 0 ;
		
	for ( int pointer : array) {
	sum += pointer;
	}

	System.out.println("The total is: " + sum);

	}
}