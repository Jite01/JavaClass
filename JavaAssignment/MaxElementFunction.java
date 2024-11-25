public class MaxElementFunction {
    public static int findMax(int[] array) {
               
        int largest = array[0];
        for (int i : array) {
            if (largest < i)  largest = i;      
       
    }
	 return largest;
	}
    
    public static void main(String[] args) {
               int[] array = {1, 5, 2, 8, 3};
        int result = findMax(array);
        System.out.println("The largest element is: " + result);
        
     }
}