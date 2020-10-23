public class StringCalculator {

	private String delimeter=",|\n";
	public int Add(String numbers) {
		
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(findlength(numbers) == 1) {
			return stringToint(numbers);
		}
		String[] input=splitString(numbers);
		
		return strAdd(input);
		
	}
	
	private String[] splitString(String input) {
		if(input.startsWith("//")) {
			String[] parts = input.split("\n",2);
			delimeter=parts[0].substring(2);
			input=parts[1];
		}
		return input.split(delimeter);
	}
	
	private int strAdd(String[] input) {
		int sum=0;
		for(String i:input) {
			sum+=stringToint(i);
		}
		return sum;
	}
		
	private int stringToint(String input) {
		return Integer.parseInt(input);
	}
	
	private int findlength(String input) {
		return input.length();
	}
	
	private boolean isEmpty(String num) {
		return num.isEmpty();
	}
}