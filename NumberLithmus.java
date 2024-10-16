import java.util.Scanner;
	public class NumberLithmus {
		public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("WELCOME TO MAGIC NUMBER SORTER \n");
		System.out.println ("Enter 5 numbers. Seperate each by a space. You can enter multiple digits as a single number. \n ");
		System.out.println ("Please be demure. Do not repeat numbers");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		int int4 = input.nextInt();
		int int5 = input.nextInt();
		int int1counter = 0;

		int int2counter = 0;
		int int3counter = 0;
		int int4counter = 0;
		int int5counter = 0;

		if (int1 > int2) {
		int1counter ++;
			}
		if (int1 > int3) {
		int1counter ++;
			}
	if (int1 > int4) {
		int1counter ++;
			}
		if (int1 > int5) {
		int1counter ++;
			}

	if (int1counter == 4) {
		System.out.println ("The first number is the largest.");
			} else if (int1counter == 3) {
		System.out.println ("The first number is the second largest.");
			} else if (int1counter == 2) {
		System.out.println ("The first number is the third largest.");
			} else if (int1counter == 1) {
	   	System.out.println ("The first number is the fourth largest.");
			} else {
		 System.out.println ("The first number is the smallest.");
			}

	if (int2 > int1) {
		int2counter ++;
			}
		if (int2 > int3) {
		int2counter ++;
			}
	if (int2 > int4) {
		int2counter ++;
			}
		if (int2 > int5) {
		int2counter ++;
			}

	if (int2counter == 4) {
		System.out.println ("The second number is the largest.");
			} else if (int2counter == 3) {
		System.out.println ("The second number is the second largest.");
			} else if (int2counter == 2) {
		System.out.println ("The second number is the third largest.");
			} else if (int2counter == 1) {
	   	System.out.println ("The second number is the fourth largest.");
			} else {
		 System.out.println ("The second number is the smallest.");
			}

if (int3 > int1) {
		int3counter ++;
			}
		if (int3 > int2) {
		int3counter ++;
			}
	if (int3 > int4) {
		int3counter ++;
			}
		if (int3 > int5) {
		int3counter ++;
			}

	if (int3counter == 4) {
		System.out.println ("The third number is the largest.");
			} else if (int3counter == 3) {
		System.out.println ("The third number is the second largest.");
			} else if (int3counter == 2) {
		System.out.println ("The third number is the third largest.");
			} else if (int3counter == 1) {
	   	System.out.println ("The third number is the fourth largest.");
			} else {
		 System.out.println ("The third number is the smallest.");
			}

if (int4 > int1) {
		int4counter ++;
			}
		if (int4 > int2) {
		int4counter ++;
			}
	if (int4 > int3) {
		int4counter ++;
			}
		if (int4 > int5) {
		int4counter ++;
			}

	if (int4counter == 4) {
		System.out.println ("The fourth number is the largest.");
			} else if (int4counter  == 3) {
		System.out.println ("The fourth number is the second largest.");
			} else if (int4counter == 2) {
		System.out.println ("The fourth number is the third largest.");
			} else if (int4counter == 1) {
	   	System.out.println ("The fourth number is the fourth largest.");
			} else {
		 System.out.println ("The fourth number is the smallest.");
			}


if (int5 > int1) {
		int5counter ++;
			}
		if (int5 > int2) {
		int5counter ++;
			}
	if (int5 > int3) {
		int5counter ++;
			}
		if (int5 > int4) {
		int5counter ++;
			}

	if (int5counter == 4) {
		System.out.println ("The fifth number is the largest.");
			} else if (int5counter  == 3) {
		System.out.println ("The fifth number is the second largest.");
			} else if (int5counter == 2) {
		System.out.println ("The fifth number is the third largest.");
			} else if (int5counter == 1) {
	   	System.out.println ("The fifth number is the fourth largest.");
			} else {
		 System.out.println ("The fifth number is the smallest.");
			}

		input.close();

}
	}

