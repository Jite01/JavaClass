import java.util.ArrayList;

public class Banke{
ArrayList<String> bankeAccountRegister = new ArrayList <>();
ArrayList<Integer> bankeAccountNumberRegister = new ArrayList <>();
ArrayList<Integer> bankeAccountPinRegister = new ArrayList <>();
ArrayList<Double> bankeAccountBalanceRegister = new ArrayList <>();


	public int generateAccountNumber() {
		int max = 1999999999;
		int min = 1000000000;
		int accountNumber = (int) ((Math.random() * (max - min)) + min);
		bankeAccountNumberRegister.add(accountNumber);
		return accountNumber;
			}

	public void setPin(int pin) {
		bankeAccountPinRegister.add(pin);
		System.out.println("\033[H\033[2J");
        	System.out.flush();

		System.out.println("You successfully set your pin. Remember to keep it private");
			}

	public  void newCustomerAppend (String customerName) {
		bankeAccountRegister.add(customerName);
		System.out.printf("Your Banke Account has been created successfully %s! Your Banke Account Number is %d", customerName,   generateAccountNumber());

	}


	
}




	