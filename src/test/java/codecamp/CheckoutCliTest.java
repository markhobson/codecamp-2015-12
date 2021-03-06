package codecamp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import static java.nio.charset.StandardCharsets.UTF_8;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutCliTest {
	
	private ByteArrayOutputStream byteOut;
	
	private PrintStream out;

	@Before
	public void setUp() throws UnsupportedEncodingException {
		byteOut = new ByteArrayOutputStream();
		out = new PrintStream(byteOut, true, UTF_8.name());
	}
	
	@Test
	public void scanWithTwoLinesOutputsTotal() throws IOException {
		InputStream in = newInputStream("Mele, Pommes, Pommes, Mele\nBananas\n");
		
		new CheckoutCli().scan(in, out);
		
		assertThat(toString(byteOut), is("250\n200\n"));
	}

	@Test
	public void scanWithOneLineOutputsTotal() throws IOException {
		InputStream in = newInputStream("Mele, Pommes, Pommes, Apples, Mele\n");
		
		new CheckoutCli().scan(in, out);
		
		assertThat(toString(byteOut), is("150\n"));
	}
	
	private static ByteArrayInputStream newInputStream(String string) {
		return new ByteArrayInputStream(string.getBytes(UTF_8));
	}

	private static String toString(ByteArrayOutputStream out) throws UnsupportedEncodingException {
		return out.toString(UTF_8.name());
	}
}
