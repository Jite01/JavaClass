public class PangramChecker{
public static Boolean pangramChecker(String inputt){
	String input = inputt.toLowerCase();
	int length = (input.length() - 1);
	boolean result =  true;
	
	for (char j ='a'; j <= 'z'; j++){
		for(char i = input.charAt(0); i <= input.charAt(length); i++){
			if (j != input.charAt(i)) result = false;
		}
	}
	System.out.print(result);
	return result;
}


public static void main(String[] args){
	pangramChecker("the quick brown fox jumps over the lazy dog");
	}
}

