package test;

public class Cast {

 // define the rules
    
    private static final String rule_one = "AB";
    private static final String rule_two = "BA";
    private static final String rule_three = "CB";
    private static final String rule_four = "BC";
    private static final String rule_five = "AA";
    private static final String rule_six = "CC";
    
    // define the replace values
    
    private static final String replace_one = "AA";
    private static final String replace_two = "AA";
    private static final String replace_three = "CC";
    private static final String replace_four = "CC";
    private static final String replace_five = "A";
    private static final String replace_six = "C";
    
	public static void main(String[] args) {
		System.out.println(solution("AAAA"));
	}

	public static String solution(String str) {

		boolean changed = false;
        
        while (true) {

			if (str.contains(rule_one)) {
				str = str.replace(rule_one, replace_one);
				changed = true;
			}
			else if (str.contains(rule_two)) {
				str = str.replace(rule_two, replace_two);
				changed = true;
			}
			else if (str.contains(rule_three)) {
				str = str.replace(rule_three, replace_three);
				changed = true;
			}
			else if (str.contains(rule_four)) {
				str = str.replace(rule_four, replace_four);
				changed = true;
			}
			else if (str.contains(rule_five)) {
				str = str.replace(rule_five, replace_five);
				changed = true;
			}
			else if (str.contains(rule_six)) {
				str = str.replace(rule_six, replace_six);
				changed = true;
			}

			if (!changed) {
				break;
			}
			changed = false;

		}
		return str;
	
	}
}
