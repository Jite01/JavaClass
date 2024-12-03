import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class StudentGrade {
	static double[][] totalDatabase;
	static ArrayList<Double> position;

public static void getPosition() {
	position = new ArrayList<>();
	for (int i = 0; i < totalDatabase.length; i++) {
		position.add(totalDatabase[i][0]);
		}
	Collections.sort(position);
	Collections.reverse(position);
	System.out.print(position);
	}

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

	int[][] database = new int [studentMean][subjectMean];
	totalDatabase = new double [studentMean][1];


	for(int i = 0 ; i <= studentMean; i++){
		if ( i >= studentMean) continue;
		for(int j = 0 ; j <= subjectMean; j++){
		if ( j >= subjectMean) continue;
		System.out.println("\033[H\033[2J");
        	System.out.flush();

		System.out.println(loadMmemonic);
		System.out.println("Entering score for student "+( i + 1) + "\n" + " Enter score for subject"+ (j + 1));
		database[i][j] = scanner.nextInt();
		totalDatabase[i][0] += database[i][j];
			}
	}
	
	System.out.println("\033[H\033[2J");
        	System.out.flush();


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
	
				System.out.printf((database[i][j]) + "%-6s", "" ); 
				}
		System.out.printf((totalDatabase[i][0]) + "%-6s", "" );
		System.out.printf(((totalDatabase[i][0]) / 2) + "%-6s", "" );
		System.out.printf("%s" + "%-6s","", "" );
		}
	
	System.out.print("""
\n
====================================================================
====================================================================
""");
		
			
		

		
	getPosition();

	
			}
	}

	

	