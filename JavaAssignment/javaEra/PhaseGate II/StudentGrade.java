import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("How many students do you have?"); 
	int studentMean = scanner.nextInt();

	System.out.println("How many subjects do they offer?"); 
	int subjectMean = scanner.nextInt();
	String loadMmemonic = """ 

	Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>
	Saved successfully
	""";
	System.out.println(loadMmemonic);
	double[][] database = new double [studentMean][subjectMean];
	double[][] totalDatabase = new double [studentMean][subjectMean];


	for(int i = 0 ; i <= studentMean; i++){
		if ( i >= studentMean) continue;
		for(int j = 0 ; j <= subjectMean; j++){
		if ( j >= subjectMean) continue;
		System.out.println("\033[H\033[2J");
        	System.out.flush();

		System.out.println(loadMmemonic);
		System.out.println("Entering score for student "+( i + 1) + "\n" + " Enter score for subject"+ (j + 1));
		database[i][j] = scanner.nextInt();
		totalDatabase[i][]
			}
	}
	

	System.out.println("====================================================================");
	System.out.printf("STUDENT %-7s", "");

	for(int j = 0 ; j <= subjectMean; j++){
	if ( j >= subjectMean) continue;
	System.out.printf("SUB" + (j  + 1) + "%-4s", "" );
		}
		
	System.out.printf("TOT %-4s AVE %-7s POS%n", "", "");
	System.out.println("====================================================================");
	
	for(int i = 0 ; i <= studentMean; i++){
		if ( i >= studentMean) continue;
		System.out.printf("%n");
		System.out.printf("Student "+( i + 1) + "%-7s", "");
			for(int j = 0 ; j <= subjectMean; j++){
				if ( j >= subjectMean) continue;
	
				System.out.printf((database[i][j]) + "%-4s", "" ); 
				
					}
		}
	
			
		

		
		

	
			}
	}

	

	