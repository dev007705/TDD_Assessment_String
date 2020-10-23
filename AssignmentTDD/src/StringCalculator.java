public class StringCalculator {

	public int Add(String numbers) {
		
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(findlength(numbers) == 1) {
			return stringToint(numbers);
		}
		String[] input=numbers.split(",|\n");
		
		return strAdd(input);
		
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