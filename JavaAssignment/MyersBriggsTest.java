import java.util.Scanner;

public class MyersBriggsTest {
    private static final String[][] questions = new String[20][2];
    private static int[] responses = new int[20];
    
    public static void initializeQuestions() {
        // Column A vs Column B options
        questions[0] = new String[]{"expend energy, enjoy groups", "conserve energy, enjoy one-on-one"};
        questions[1] = new String[]{"interpret literally", "look for meaning and possibilities"};
        questions[2] = new String[]{"logical, thinking, questioning", "empathetic, feeling, accommodating"};
        questions[3] = new String[]{"organized, orderly", "flexible, adaptable"};
        questions[4] = new String[]{"more outgoing, think out loud", "more reserved, think to yourself"};
        questions[5] = new String[]{"practical, realistic, experiential", "imaginative, innovative, theoretical"};
        questions[6] = new String[]{"candid, straight forward, frank", "tactful, kind, encouraging"};
        questions[7] = new String[]{"plan, schedule", "unplanned, spontaneous"};
        questions[8] = new String[]{"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"};
        questions[9] = new String[]{"standard, usual, conventional", "different, novel, unique"};
        questions[10] = new String[]{"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"};
        questions[11] = new String[]{"regulated, structured", "easygoing, 'live' and 'let live'"};
        questions[12] = new String[]{"external, communicative, express yourself", "internal, reticent, keep to yourself"};
        questions[13] = new String[]{"focus on here-and-now", "look to the future, global perspective, 'big picture'"};
        questions[14] = new String[]{"tough-minded, just", "tender-hearted, merciful"};
        questions[15] = new String[]{"preparation, plan ahead", "go with the flow, adapt as you go"};
        questions[16] = new String[]{"active, initiate", "reflective, deliberate"};
        questions[17] = new String[]{"facts, things, 'what is'", "ideas, dreams, 'what could be,' philosophical"};
        questions[18] = new String[]{"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"};
        questions[19] = new String[]{"control, govern", "latitude, freedom"};
    }
    
    public static void conductTest() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Myers-Briggs Personality Test!");
        System.out.println("For each question, enter:");
        System.out.println("0 for Column A (first option)");
        System.out.println("1 for Column B (second option)");
        System.out.println();
        
        for (int i = 0; i < 20; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println("A: " + questions[i][0]);
            System.out.println("B: " + questions[i][1]);
            
            while (true) {
                System.out.print("Your choice (0/1): ");
                String input = scanner.nextLine();
                if (input.equals("0") || input.equals("1")) {
                    responses[i] = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 0 or 1.");
                }
            }
        }
    }
    
    public static String calculatePersonalityType() {
        // Count preferences for each dimension
        int e = 0, i = 0;  // Extraversion vs Introversion
        int s = 0, n = 0;  // Sensing vs Intuition
        int t = 0, f = 0;  // Thinking vs Feeling
        int j = 0, p = 0;  // Judging vs Perceiving
        
        // E/I questions: 1, 5, 9, 13, 17
        for (int q : new int[]{0, 4, 8, 12, 16}) {
            if (responses[q] == 0) e++; else i++;
        }
        
        // S/N questions: 2, 6, 10, 14, 18
        for (int q : new int[]{1, 5, 9, 13, 17}) {
            if (responses[q] == 0) s++; else n++;
        }
        
        // T/F questions: 3, 7, 11, 15, 19
        for (int q : new int[]{2, 6, 10, 14, 18}) {
            if (responses[q] == 0) t++; else f++;
        }
        
        // J/P questions: 4, 8, 12, 16, 20
        for (int q : new int[]{3, 7, 11, 15, 19}) {
            if (responses[q] == 0) j++; else p++;
        }
        
        // Determine each letter based on which preference is stronger
        StringBuilder type = new StringBuilder();
        type.append(e > i ? 'E' : 'I');
        type.append(s > n ? 'S' : 'N');
        type.append(t > f ? 'T' : 'F');
        type.append(j > p ? 'J' : 'P');
        
        return type.toString();
    }
    
    public static void displayResults(String type) {
        System.out.println("\nYour Myers-Briggs Personality Type is: " + type);
        System.out.println("\nType Breakdown:");
        System.out.println(type.charAt(0) == 'E' ? "Extraversion (E)" : "Introversion (I)");
        System.out.println(type.charAt(1) == 'S' ? "Sensing (S)" : "Intuition (N)");
        System.out.println(type.charAt(2) == 'T' ? "Thinking (T)" : "Feeling (F)");
        System.out.println(type.charAt(3) == 'J' ? "Judging (J)" : "Perceiving (P)");
    }
    
    public static void main(String[] args) {
        initializeQuestions();
        conductTest();
        String personalityType = calculatePersonalityType();
        displayResults(personalityType);
    }
}