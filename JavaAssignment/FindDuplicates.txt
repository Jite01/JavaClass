public class FindDuplicates {
    public static void findDuplicates(int[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            for (int j = i + 1; j < testArray.length; j++) {
                if (testArray[i] == testArray[j]) {
                    System.out.println(testArray[i]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 3, 5, 6, 5};
        findDuplicates(numbers);
    }
}