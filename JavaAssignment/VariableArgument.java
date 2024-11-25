import java.util.Scanner;

public class VariableArgument {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
	int[] demoArray = new int[args.length];

	for (int i = 0; i < args.length; i++)
		for(int j = scanner.nextInt(); j != 0 ; j = scanner.nextInt()){
		System.out.print("Enter element in array");
		demoArray[i] = j;
		}

	}
}

