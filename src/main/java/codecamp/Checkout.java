package codecamp;

public class Checkout {
	
	private int total;
	
	private boolean cherries;
	
	public Checkout() {
		total = 0;
		cherries = false;
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
			
			if (cherries) {
				total -= 30;
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
