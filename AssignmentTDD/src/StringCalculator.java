public class StringCalculator {

	public int Add(String numbers) {

		String[] input=numbers.split(",");
		
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length() == 1) {
			return stringToint(numbers);
		}
	
		return strAdd(input[0],input[1]);
		
	}
	private int strAdd(String num1, String num2) {
		return stringToint(num1)+stringToint(num2);
	}
	
	private int stringToint(String input) {
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String num) {
		return num.isEmpty();
	}
}