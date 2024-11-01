import java.util.Scanner;

	public class SwitchTest {
	  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
       
          System.out.print("1: Phone book\n2: Messages\n3: Chat\n4: Call Register\n");

       	  int menu = scanner.nextInt();

	  switch(menu) {
	  System.out.print("Nokia");

	  case 1:
	  switch(phoneBook) {

	   System.out.print("1: Search\n2: Service Nos.\n3: Add Name\n4: Erase \n6: Assign Tone\n7: Send b'card\n8: Options\n9: Speed Dials\n10: Voice Tags\n");

	  int phoneBook = scanner.nextInt();


	  case 1:
	  System.out.println("Search");
	  break;

	  case 2:
	  System.out.println("Service Nos.");
	  break;

	  case 3:
	  System.out.println("Add Name");
	  break;

	  case 4:
	  System.out.println("Erase");
	  break;

	  case 5:
	  System.out.println("Edit");
	  break;

	  case 6:
	  System.out.println("Assign tone");
	  break;

	  case 7:
	  System.out.println("Send b'card");
	  break;

	  case 8:
	  System.out.println("1: Type of view\n2: Memory Status\n");

	  int options = scanner.nextInt();


	  switch (options) {
	  case 1: 
	  System.out.println("Type of view");
	  break;

	  case 2: 
	  System.out.println("Memory Status");
	  break;
	 }
	  break;

	  case 9:
	  System.out.println("Speed Dials");
	  break;


	  case 10:
	  System.out.println("Voice Tags");
	  break;
	}
	  break;






             }
	





































		}
	}