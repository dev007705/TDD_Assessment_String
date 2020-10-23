public class StringCalculator {

	public int Add(String numbers) {

		if(isEmpty(numbers)) {
			return 0;
		}
		return stringToint(numbers);
		
	}
	
	private int stringToint(String input) {
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String num) {
		return num.isEmpty();
	}
}