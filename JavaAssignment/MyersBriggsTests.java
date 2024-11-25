import java.util.Scanner;

public class MyersBriggsTests {
    public static void main(String[] args) {
       String[] questions = new String[20];
       String[] answers = new String[20];
        Scanner input = new Scanner(System.in);
        
       questions[0] = "A: expend energy, enjoy groups\tB: conserve energy, enjoy one-on-one";
        questions[1] = "A: interpret literally\tB: look for meaning and possibilities";
        questions[2] = "A: logical, thinking, questioning\tB: empathetic, feeling, accommodating";
        questions[3] = "A: organized, orderly\tB: flexible, adaptable";
        questions[4] = "A: more outgoing, think out loud\tB: more reserved, think to yourself";
        questions[5] = "A: practical, realistic, experiential\tB: imaginative, innovative, theoretical";
        questions[6] = "A: candid, straight forward, frank\tB: tactful, kind, encouraging";
        questions[7] = "A: plan, schedule\tB: unplanned, spontaneous";
        questions[8] = "A: seek many tasks, public activities, interaction with others\tB: seek private, solitary activities with quiet to concentrate";
        questions[9] = "A: standard, usual, conventional\tB: different, novel, unique";
        questions[10] = "A: firm, tend to criticize, hold the line\tB: gentle, tend to appreciate, conciliate";
        questions[11] = "A: regulated, structured\tB: easygoing, 'live' and 'let live'";
        questions[12] = "A: external, communicative, express yourself\tB: internal, reticent, keep to yourself";
        questions[13] = "A: focus on here-and-now\tB: look to the future, global perspective, 'big picture'";
        questions[14] = "A: tough-minded, just\tB: tender-hearted, merciful";
        questions[15] = "A: preparation, plan ahead\tB: go with the flow, adapt as you go";
        questions[16] = "A: active, initiate\tB: reflective, deliberate";
        questions[17] = "A: facts, things, 'what is'\tB: ideas, dreams, 'what could be,' philosophical";
        questions[18] = "A: matter of fact, issue-oriented\tB: sensitive, people-oriented, compassionate";
        questions[19] = "A: control, govern\tB: latitude, freedom";

       
	 
        System.out.println("Welcome to Myers Briggs Test");
	System.out.print("What's your name?\nName:");
	String userName = input.nextLine();
        System.out.println("Answer 'A' for first option (A) or 'B' for second option (B)");
        
                for(int i = 0; i < 20; i++) {
            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);
            System.out.print("Your answer (A/B): ");
            answers[i] = input.nextLine();
        }
        
        
        int E = 0;   
        int S = 0;  
        int T = 0;          
	int J = 0; 
	int I = 0;
	int N = 0;
	int F = 0;
	int P = 0;
        
        if(answers[0] == "A") E++; else I++;
        if(answers[4] == "A") E++; else I++;
        if(answers[8] == "A") E++; else I++;
        if(answers[12] == "A") E++; else I++;
        if(answers[16] == "A") E++; else I++;
        
        
        if(answers[1] == "A") S++; else N++;
        if(answers[5] == "A") S++; else N++;
        if(answers[9] == "A") S++; else N++;
        if(answers[13] == "A") S++; else N++;
        if(answers[17] == "A") S++; else N++;
        
        if(answers[2] == "A") T++; else F++;
        if(answers[6] == "A") T++; else F++;
        if(answers[10] == "A") T++; else F++;
        if(answers[14] == "A") T++; else F++;
        if(answers[18] == "A") T++; else F++;
        
        if(answers[3] == "A") J++; else P++;
        if(answers[7] == "A") J++; else P++;
        if(answers[11] == "A") J++; else P++;
        if(answers[15] == "A") J++; else P++;
        if(answers[19] == "A") J++; else P++;
        
                String type = "";
        
        
        if(E > I)
            type += "E";
        else
            type += "I";
            
        if(S > N)
            type += "S";
        else
            type += "N";
            
        if(T > F)
            type += "T";
        else
            type += "F";
            
        if(J > P)
            type += "J";
        else
            type += "P";
        
                System.out.println(userName + " your personality type is: " + type);
        
        
        System.out.println("\nScores for each category:");
        System.out.println("E: " + E + " vs I: " + I);
        System.out.println("S: " + S + " vs N: " + N);
        System.out.println("T: " + T + " vs F: " + F);
        System.out.println("J: " + J + " vs P: " + P);
    }
}