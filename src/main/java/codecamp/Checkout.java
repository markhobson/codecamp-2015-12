package codecamp;

public class Checkout {
	
	private int total;
	
	private boolean cherries;
	
	private boolean bananas;
	
	public Checkout() {
		total = 0;
		cherries = false;
		bananas = false;
	}

	public void scan(String line) {
		if ("Apples".equals(line)) {
			total += 100;
		}
		else if ("Bananas".equals(line)) {
			total += 150;
			
			if (bananas) {
				total -= 150;
				bananas = false;
			}
			else {
				bananas = true;
			}
		}
		else if ("Cherries".equals(line)) {
			total += 75;
			
			if (cherries) {
				total -= 20;
				cherries = false;
			}
			else {
				cherries = true;
			}
		}
	}

	public int getTotal() {
		return total;
	}
}
