import java.util.Scanner;
 public class IntAddition {
 public static void main (String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter an integer between 0 and 1000");
 int initial = scanner.nextInt();
 int int1 = initial % 10;
 if (int1 < 10) {
 System.out.println(int1);
} else {
  int int2 = initial % 1;
}
 System.out.println(int2);
}
}