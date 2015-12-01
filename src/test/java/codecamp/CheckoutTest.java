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
	public void scanWithPommesAdds100() {
		checkout.scan("Pommes");
		
		assertThat(checkout.getTotal(), is(100));
	}
	
	@Test
	public void scanWithThreePommesSubtracts100() {
		checkout.scan("Pommes");
		checkout.scan("Pommes");
		checkout.scan("Pommes");
		
		assertThat(checkout.getTotal(), is(200));
	}
	
	@Test
	public void scanWithMeleAdds100() {
		checkout.scan("Mele");
		
		assertThat(checkout.getTotal(), is(100));
	}
	
	@Test
	public void scanWithTwoMeleSubtracts50() {
		checkout.scan("Mele");
		checkout.scan("Mele");
		
		assertThat(checkout.getTotal(), is(150));
	}
	
	@Test
	public void scanWithBananasAdds150() {
		checkout.scan("Bananas");
		
		assertThat(checkout.getTotal(), is(150));
	}
	
	@Test
	public void scanWithCherriesAdds75() {
		checkout.scan("Cherries");
		
		assertThat(checkout.getTotal(), is(75));
	}
	
	@Test
	public void scanWithTwoCherriesSubtracts20() {
		checkout.scan("Cherries");
		checkout.scan("Cherries");
		
		assertThat(checkout.getTotal(), is(130));
	}
	
	@Test
	public void scanWithTwoBananasSubtracts150() {
		checkout.scan("Bananas");
		checkout.scan("Bananas");
		
		assertThat(checkout.getTotal(), is(150));
	}
}
