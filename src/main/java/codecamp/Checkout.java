package codecamp;

public class Checkout {
	
	private int total;
	
	private int pommes;
	
	private int mele;
	
	private boolean cherries;
	
	private boolean bananas;
	
	public Checkout() {
		total = 0;
		pommes = 0;
		mele = 0;
		cherries = false;
		bananas = false;
	}

	public void scan(String line) {
		if ("Apples".equals(line)) {
			total += 100;
		}
		else if ("Pommes".equals(line)) {
			total += 100;
			
			pommes++;
			
			if (pommes == 3) {
				total -= 100;
				pommes = 0;
			}
		}
		else if ("Mele".equals(line)) {
			total += 100;
			
			mele++;
			
			if (mele == 2) {
				total -= 50;
				mele = 0;
			}
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
