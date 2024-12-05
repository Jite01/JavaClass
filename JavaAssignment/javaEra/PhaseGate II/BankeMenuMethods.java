import java.util.Scanner;

public class BankeMenuMethods {
static Scanner scanner = new Scanner(System.in);
static BankeRegister register = new BankeRegister();
static BankeATM atm = new BankeATM();
static int verifyAccountResponse;
static int litmus;
static int pin;
static double amount;

	public void accountCreation() {

	System.out.println("\033[H\033[2J");
        System.out.flush();

	System.out.print(""" 

	Welcome Esteemed Customer! Lets Create a Unique Account For You Right Away->
	
	Enter Your First Name->\nFirstName->
	""");
	String firstName = scanner.next();
	System.out.print("\nEnter Your Last Name->\nLastName->\n");
	String lastName = scanner.next();
	String space = " ";

	System.out.println("\033[H\033[2J");
        System.out.flush();

	String customerrName = firstName.concat(space);
	String customerName = customerrName.concat(lastName);
	
	register.newCustomerAppend(customerName);

	System.out.print(""" 

	-----------------------------------------------------------------------------------------------------------------

	Let's setup your PIN.
	Enter a four(4) digit pin to be used for transactions->
	""");

	pin = scanner.nextInt();

	while (Integer.toString(pin).length() != 4 ) {
	System.out.print("Pin must be four(4) digits. Try again\n");
	pin = scanner.nextInt();
		}
	register.setPin(pin);
	}		


	public static double verifyAccount (double increment) {
	 
	System.out.printf("Hi! %s. Pls Verify It Is You->%n Enter PIN--------------------------------->%nPIN->", register.bankeAccountRegister.get(litmus));	
	int pinTemp = scanner.nextInt();

	while (Integer.toString(pin).length() != 4 ) {

	System.out.print("Something Wrong?.. Try again\n");
	pinTemp = scanner.nextInt();
		}
	if (pinTemp == register.bankeAccountPinRegister.get(litmus))	  { 
	System.out.printf("%n%n<-------------------------------------------");

	if (atm.menuResponse == 2) {
	System.out.print("How Much Do You Want To Deposit?----------------------------------------->\nDeposit Amount:");
	amount = scanner.nextDouble();
	balanceChange(amount);
		}

	else if (atm.menuResponse == 3) {
	System.out.print("How Much Do You Want To Withdraw?----------------------------------------->\nWithdraw Amount:");
	amount = scanner.nextDouble();
	balanceDeduct(amount);
		}

	else if (atm.menuResponse == 4) {
	System.out.print("How Much Do You Want To Withdraw?----------------------------------------->\nWithdraw Amount:");
	amount = scanner.nextDouble();
	balanceDeduct(amount);
		}
	
	
	else if (atm.menuResponse == 5) {
	System.out.print("How Much Do You Want To Withdraw?----------------------------------------->\nWithdraw Amount:");
	amount = scanner.nextDouble();
	balanceDeduct(amount);
		}

	else if (atm.menuResponse == 6) {
	System.out.print("How Much Do You Want To Withdraw?----------------------------------------->\nWithdraw Amount:");
	amount = scanner.nextDouble();
	balanceDeduct(amount);
		}

	else if (atm.menuResponse == 7) {
	System.out.print("How Much Do You Want To Withdraw?----------------------------------------->\nWithdraw Amount:");
	amount = scanner.nextDouble();
	balanceDeduct(amount);
		}
	else{System.out.print(atm.menuResponse);}
}


	else {
	System.out.println("Wrong credentials supplied");
	verifyAccount(0);
		}
	return amount;
	}


	public void depositMoney() {

	System.out.print("""
	 						Verify Your Account With    
  
					1:  Account Name?         /            2:  Account Number?
						    

	                                                   	 3: Main Menu?

	""");

	verifyAccountResponse = scanner.nextInt();

	switch (verifyAccountResponse) {
	
	case 1:	System.out.print("Enter Your First Name->\nFirstName->\n");
			String firstNameTemp = scanner.next();
			System.out.print("\nEnter Your Last Name->\nLastName->\n");
			String lastNameTemp = scanner.next();
			String space = " ";
			System.out.println("\033[H\033[2J");
        		System.out.flush();

			String customerrNameTemp = firstNameTemp.concat(space);
			String customerNameTemp = customerrNameTemp.concat(lastNameTemp);
			
			
			litmus = register.bankeAccountRegister.indexOf(customerNameTemp);
			if (litmus == -1) {
			 System.out.println("Account Name Not Found...");
			depositMoney();
				}

			else if (litmus != -1) {
			int litmus2 = register.bankeAccountRegister.lastIndexOf(customerNameTemp);
			if (litmus2 == litmus) {
        		verifyAccount(0);
    				} else {
       			System.out.println("Pls Verify With AccountNumber\n");
        		depositMoney();
  				  }
		break;
			}

	case 2: System.out.printf("Enter Your Account Number--------------------------------->%nAccountNumber->%n");
		int accountNumberTemp = scanner.nextInt();

		System.out.println("\033[H\033[2J");
        	System.out.flush();
		
		while (Integer.toString(accountNumberTemp).length() != 10 ) {
		System.out.print("Invalid Account Number.. Try again\n");
		accountNumberTemp = scanner.nextInt();
		}

		litmus = register.bankeAccountNumberRegister.indexOf(accountNumberTemp);

		if (litmus == -1) {
			 System.out.println("Account Number Not Found...");
			depositMoney();
				}
		else verifyAccount(0);
		break;

	case 3: atm.bankeMenu();
		break;
		
		} //switch

	}  //method




	public static void balanceChange(double amount) {
	
	double currentBalance = register.bankeAccountBalanceRegister.get(litmus);
	currentBalance += amount;
	register.bankeAccountBalanceRegister.set(litmus, currentBalance);

	System.out.printf("%nSuccessful! $%.2f added to your account %s.%n%nYour Account Balance Is $%.2f%n", amount, register.bankeAccountRegister.get(litmus), register.bankeAccountBalanceRegister.get(litmus));
	
System.out.print("""

				1: Deposit Again     /        2:    Back to MainMenu
""");
	int nextAction = scanner.nextInt();

	switch(nextAction) {

	case 1:   System.out.println("\033[H\033[2J");
        		System.out.flush();

			verifyAccount(0);
			break;
			
	case 2:  System.out.println("\033[H\033[2J");
        		System.out.flush();

			atm.bankeMenu();
			break;
				}

		}



	public static void balanceDeduct(double amount) {
	
	/**double currentBalance = register.bankeAccountBalanceRegister.get(litmus);
	currentBalance += amount;
	register.bankeAccountBalanceRegister.set(litmus, currentBalance);

	System.out.printf("%nSuccessful! $%.2f added to your account %s.%n%nYour Account Balance Is $%.2f%n", amount, register.bankeAccountRegister.get(litmus), register.bankeAccountBalanceRegister.get(litmus));
	
System.out.print("""

				1: Deposit Again     /        2:    Back to MainMenu
""");
	int nextAction = scanner.nextInt();

	switch(nextAction) {

	case 1:   System.out.println("\033[H\033[2J");
        		System.out.flush();

			verifyAccount(0);
			break;
			
	case 2:  System.out.println("\033[H\033[2J");
        		System.out.flush();

			atm.bankeMenu();
			break;
				}*/

		}


} //class

