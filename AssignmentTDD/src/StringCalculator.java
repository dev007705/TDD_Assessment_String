public class StringCalculator {

	public int Add(String numbers) {

		String[] input=numbers.split(",");
		
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length() == 1) {
			return stringToint(numbers);
		}
		else if(numbers.length() == 3 ) {
			return strAdd(input[0],input[1]);
		}
		return strAdd(input);
		
	}
	
	private int strAdd(String[] input) {
		int sum=0;
		for(String i:input) {
			sum+=Integer.parseInt(i);
		}
		return sum;
	}
	private int strAdd(String num1, String num2) {
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
		
	private int stringToint(String input) {
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String num) {
		return num.isEmpty();
	}
}