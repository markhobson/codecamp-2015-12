package codecamp;

public class Checkout {
	
	private int total;
	
	public Checkout() {
		total = 0;
	}

	public void scan(String line) {
		if ("Apples".equals(line)) {
			total += 100;
		}
		else if ("Bananas".equals(line)) {
			total += 150;
		}
		else if ("Cherries".equals(line)) {
			total += 75;
		}
	}

	public int getTotal() {
		return total;
	}
}
