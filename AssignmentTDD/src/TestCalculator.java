import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class TestCalculator {

	private StringCalculator cal;
	@Before
	public void init() {
		cal=new StringCalculator();
	}
	
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
	@Test
	public void unknownAmountString() throws Exception {
		assertEquals(cal.Add("1,2,3,4"),10);
	}
	@Test
	public void newlines() throws Exception {
		assertEquals(cal.Add("1\n2,3"),6);
	}
	@Test
	public void multipledelimeter() throws Exception {
		assertEquals(cal.Add("//;\n1;2"),3);
	}
	@Test(expected = Exception.class)
	public void negativeNumbers() throws Exception {
		cal.Add("-1");
	}
}