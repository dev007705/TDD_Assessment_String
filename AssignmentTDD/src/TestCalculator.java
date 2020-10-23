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
	public void emptyString() {
		assertEquals(cal.Add(""),0);
	}
	
	@Test
	public void singleString() {
		assertEquals(cal.Add("1"),1);
	}
	
	@Test
	public void twoString() {
		assertEquals(cal.Add("2,4"),6);
	}
}