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
}