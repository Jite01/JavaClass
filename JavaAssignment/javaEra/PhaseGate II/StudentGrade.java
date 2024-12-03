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

	for(int i = 0 ; i <= studentMean; i++){
		if ( i >= studentMean) continue;
		for(int j = 0 ; j <= subjectMean; j++){
		if ( j >= subjectMean) continue;
		System.out.println("\033[H\033[2J");
        	System.out.flush();

		System.out.println(loadMmemonic);
		System.out.println("Enter score for student"+( i + 1) + " for subject"+ (j + 1));
		database[i][j] = scanner.nextInt();
		
		
			}
	
	}
	


	
			
		

		
		

	
			}
	}

	

	
