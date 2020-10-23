import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

	@Test
	public void emptyString() {
		StringCalculator cal=new StringCalculator();
		assertEquals(cal.Add(""),0);
	}
}