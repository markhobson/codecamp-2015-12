package codecamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CheckoutCli {

	public void scan(InputStream in, PrintStream out) {
		Checkout checkout = new Checkout();
		
		try (Scanner scanner = new Scanner(in)) {
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				checkout.scan(line);
				
				out.println(checkout.getTotal());
			}
		}
	}
	
	public static void main(String[] args) {
		new CheckoutCli().scan(System.in, System.out);
	}
}
