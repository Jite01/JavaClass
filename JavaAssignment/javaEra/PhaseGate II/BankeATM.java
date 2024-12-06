import java.util.Scanner; 

public class BankeATM {
static Scanner scanner = new Scanner(System.in);
static BankeRegister register = new BankeRegister();
static BankeMenuMethods method = new BankeMenuMethods();
static BankeATM atm = new BankeATM();
 static int menuResponse;
	


	public void bankeMenu() {
		String textPrompt = """

	Welcome to Banke ATM:                                                                 what would you like to do?

		
						1: Create Account

						2: Deposit Money

						3: Withdraw Money

						4: Check Account Balance

						5: Transfer To Anothr Banke User

						6: Change PIN

						7: Close Account

""";
	System.out.print(textPrompt);
	
	menuResponse = scanner.nextInt();
	
	switch(menuResponse) {
		case 1: method.accountCreation();
			break;
			
		case 2: method.depositMoney();
			break;

		case 3: method.depositMoney();
			break;

		case 4: method.depositMoney();
			break;

		case 5: method.transferAmount();
			break;

		case 6: method.depositMoney();
			break;

		case 7: method.depositMoney();
			break;
		}

	}

	


	public static void main (String[] args) { 
	
	atm.bankeMenu();


		}






	}