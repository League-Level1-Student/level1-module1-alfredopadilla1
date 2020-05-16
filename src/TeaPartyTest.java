import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TeaPartyTest {
	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
		assertNotEquals("Hello Ms. Austen", teaParty.welcome("Austen", false, true));
		assertNotEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", true, true));
		assertNotEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", true, false));
	}
}
