package codecamp;

public class Checkout {
	
	private int total;
	
	private boolean cherries;
	
	public void scan(String line) {
		total = 0;
		cherries = false;
		
		for (String item : line.split(",")) {
			scanItem(item.trim());
		}
	}

	private void scanItem(String item) {
		if ("Apples".equals(item)) {
			total += 100;
		}
		else if ("Bananas".equals(item)) {
			total += 150;
		}
		else if ("Cherries".equals(item)) {
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
