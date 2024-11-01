import java.util.Scanner;

	public class SwitchTest2 {
	  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
       
          System.out.print("Choose an option\n1: English\n2: Yoruba\n3: Igbo\n4: French\n");

       	  int Language = scanner.nextInt();

	  switch(Language) {
	  case 1:
	  System.out.println("Hello there\n\n");
         
	  System.out.println("Whats the time \n1: morning \n2: afternoon \n3: evening");
          int time = scanner.nextInt();
	

	  switch (time) {
	  case 1:
	  System.out.println("Good morning");
	  break;

	  case 2:
	  System.out.println("Good afternoon");
	  break;

	  case 3:
	  System.out.println("Good evening");
	  break;

	}
	  break;

	  case 2:
	  System.out.println("Bawo ni");
	  
	  System.out.println("Ki l'ago so? \n1: àárọ \n2: ọ̀sán \n3: ìrọ̀lẹ́");
          int timeYoruba = scanner.nextInt();
	

	  switch (timeYoruba) {
	  case 1:
	  System.out.println("Ẹ káárọ̀ ");
	  break;

	  case 2:
	  System.out.println("Ẹ káàsán ");
	  break;

	  case 3:
	  System.out.println("Ẹ káalẹ̀ ");
	  break;

	}
	  break;


	  case 3:
	  System.out.println("Nnọọ");
	  
	  System.out.println("Kedu oge? \n1: ụtụtụ \n2: ehihie \n3: mgbede");
          int timeIgbo = scanner.nextInt();
	

	  switch (timeIgbo) {
	  case 1:
	  System.out.println("Ụtụtụ ọmà");
	  break;

	  case 2:
	  System.out.println("Ehihie ọma");
	  break;

	  case 3:
	  System.out.println("Ka chi fo");
	  break;

	}
	  break;


	  case 4:
	  System.out.println("Bonjour");
	  
	  System.out.println("Quelle heure est-il? \n1: matin \n2: après-midi \n3: soir");
          int timeFrench = scanner.nextInt();
	

	  switch (timeFrench) {
	  case 1:
	  System.out.println("Bonjour̀");
	  break;

	  case 2:
	  System.out.println("Bon après-midi");
	  break;

	  case 3:
	  System.out.println("Bonne nuit");
	  break;

	}
	  break;


	 



	}
          
	    }
		}
	