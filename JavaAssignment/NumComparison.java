import java.util.Scanner;
/* Importing Class Scanner in java's utility package */
	public class NumComparison {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter five number pretty please?: ");
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		int int3 = scanner.nextInt();
		int int4 = scanner.nextInt();
		int int5 = scanner.nextInt();
		
		int positiveValue = 0;
		int negativeValue = 0;
		int zeroValue = 0;
		
		if (int1 >= 1) {
		positiveValue ++;		
		}
				
		if (int1 == 0) {
		zeroValue ++;
		}
  
		if (int1 < 0) {
		negativeValue ++;		
		}

		if (int2 >= 1) {
		positiveValue ++;		
		}
				
		if (int2 == 0) {
		zeroValue ++;
		}
  
		if (int2 < 0 ) {
		negativeValue ++;		
		}

		if (int3 >= 1 ) {
		positiveValue ++;		
		}

		if (int3 < 0) {
		negativeValue ++;		
		}


		if (int3 == 0) {
		zeroValue ++;		
		}
		
		if (int4 >= 1 ) {
		positiveValue ++;		
		}

		if (int4 < 0) {
		negativeValue ++;		
		}


		if (int4 == 0) {
		zeroValue ++;		
		}

		if (int5 >= 1 ) {
		positiveValue ++;		
		}

		if (int5 < 0) {
		negativeValue ++;		
		}


		if (int5 == 0) {
		zeroValue ++;		
		}



		System.out.printf("You typed in %d positive numbers%nYou typed in %d zero numbers%nYou typed in %d negative numbers%n", positiveValue, zeroValue, negativeValue);


	}
   }

		