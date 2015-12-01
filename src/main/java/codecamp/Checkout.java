package codecamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Checkout {

	public void scan(InputStream in, PrintStream out) {
		try (Scanner scanner = new Scanner(in)) {
			int total = 0;
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				if ("Apples".equals(line)) {
					total += 100;
				}
				else if ("Cherries".equals(line)) {
					total += 75;
				}
				
				out.println(total);
			}
		}
	}
	
	public static void main(String[] args) {
		new Checkout().scan(System.in, System.out);
	}
}
