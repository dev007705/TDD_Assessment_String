public class StringCalculator {

	public int Add(String numbers) {

		String[] input=numbers.split(",");
		
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length() == 1) {
			return stringToint(numbers);
		}
	
		return stringToint(input[0])+stringToint(input[1]);
		
	}

	private int stringToint(String input) {
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String num) {
		return num.isEmpty();
	}
}