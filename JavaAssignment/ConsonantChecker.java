import java.util.Scanner;
public class ConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an alphabet: ");
        String alphabet = scanner.nextLine();
        
        if (alphabet.length() > 1) {
            System.out.println("Error: Please enter a single character");
        }
else if(!alphabet.equals("a") && !alphabet.equals("b") && !alphabet.equals("c") && !alphabet.equals("d") && !alphabet.equals("e") && !alphabet.equals("f") && !alphabet.equals("g") && !alphabet.equals("h") && !alphabet.equals("i") && !alphabet.equals("j") && !alphabet.equals("k") && !alphabet.equals("l") && !alphabet.equals("m") && !alphabet.equals("n") && !alphabet.equals("o") && !alphabet.equals("p") && !alphabet.equals("q") && !alphabet.equals("r") && !alphabet.equals("s") && !alphabet.equals("t") && !alphabet.equals("u") && !alphabet.equals("v") && !alphabet.equals("w") && !alphabet.equals("x") && !alphabet.equals("y") && !alphabet.equals("z")) {
      System.out.println("Error. input should be a letter");
}
        else {
            char letter = alphabet.charAt(0);
            
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }
}