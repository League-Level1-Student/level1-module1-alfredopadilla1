import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		String greeting = teaParty.welcome(null, false, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false, false));
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true, false));
	}
}