public class StringCalculator {

private String delimeter=",|\n";
	
	public int Add(String numbers) throws Exception{
		
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
		if(isStarts(input)) {
			String[] parts = input.split("\n",2);
			delimeter=parts[0].substring(2);
			input=parts[1];
		}
		return input.split(delimeter);
	}
	
	private boolean isStarts(String input) {
		return input.startsWith("//");
	}
	
	private int strAdd(String[] input) throws Exception{
		isNegative(input);
		
		return calculateSum(input);
	}
	
	private int calculateSum(String[] input) {
		int sum=0;
		for(String i:input) {
			if(stringToint(i)>1000) {
				continue;
			}
			sum+=stringToint(i);
		}
		return sum;
	}
	
	private void isNegative(String[] num) throws Exception {
		String msg="";
		int count=0;
		for(String i:num) {
			if(stringToint(i)<0) {
				count++;
			}
		}
		if(count>0) {
			for(String i:num) {
				if(stringToint(i)<0) {
					msg+=i+",";
				}
			}
			throw new Exception("negative not allowed "+msg);
		}
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