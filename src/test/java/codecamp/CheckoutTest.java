package codecamp;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutTest {
	
	private Checkout checkout;

	@Before
	public void setUp() {
		checkout = new Checkout();
	}

	@Test
	public void scanWithApplesAdds100() {
		checkout.scan("Apples");
		
		assertThat(checkout.getTotal(), is(100));
	}
	
	@Test
	public void scanWithCherriesAdds75() {
		checkout.scan("Cherries");
		
		assertThat(checkout.getTotal(), is(75));
	}
}
