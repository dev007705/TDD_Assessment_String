import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class TestCalculator {

	private StringCalculator cal;
	@Before
	public void init() {
		cal=new StringCalculator();
	}
	
	// for empty,1 & 2 inputs #1
	@Test
	public void emptyString() throws Exception {
		assertEquals(cal.Add(""),0);
	}
	@Test
	public void singleString() throws Exception {
		assertEquals(cal.Add("1"),1);
	}
	@Test
	public void twoString() throws Exception {
		assertEquals(cal.Add("2,4"),6);
	}
	// for unknown amount of string input #2
	@Test
	public void unknownAmountString() throws Exception {
		assertEquals(cal.Add("1,2,3,4"),10);
	}
	// allow to handle new lines #3
	@Test
	public void newlines() throws Exception {
		assertEquals(cal.Add("1\n2,3"),6);
	}
	// allow to support different delimeter #4
	@Test
	public void multipledelimeter() throws Exception {
		assertEquals(cal.Add("//;\n1;2"),3);
	}
	// show exception for negative number #5
	@Test(expected = Exception.class)
	public void negativeNumber() throws Exception {
		cal.Add("-1");
	}
	// show exception for multiple negative numbers #6
	@Test(expected  = Exception.class)
	public void multipleNegativeNumbers() throws Exception {
		cal.Add("-1,-4,-6");
	}
	// Number bigger than 1000 should be ignored
	@Test
	public void ignoreNumberGreaterThan1000() throws Exception {
		assertEquals(cal.Add("2,1001"),2);
	}
	//Delimiter with any length of defined format
	@Test
	public void AnyLengthDelimeter() throws Exception {
		assertEquals(cal.Add("//[***]\n1***2***3"),6);
	}
	//Allow multiple Delimiter 
	@Test
	public void allowMultipleDelimeter() throws Exception {
		assertEquals(cal.Add("//[*][%]\n1*2%3"),6);
	}
}