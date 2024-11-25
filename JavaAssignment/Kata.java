import java.util.ArrayList;
public class Kata {
        public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
        public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public int subtract(int num1, int num2) {
        return Math.abs(num1 - num2);
    }
    
        public float divide(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return (float) num1 / num2;
    }
    
        public int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
       public boolean isSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
    
      public boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        int left = 0;
        int right = numStr.length() - 1;
        
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
       public long factorialOf(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorialOf(number - 1);
    }
    
       public long squareOf(int number) {
        return (long) number * number;
    }
}


 public List<String> Merger(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());
        
        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

 public List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        String numStr = String.valueOf(number);
        
        for (char digit : numStr.toCharArray()) {
            digits.add(Character.getNumericValue(digit));
        }
        return digits;
    }
}

