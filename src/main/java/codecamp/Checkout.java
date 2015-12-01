package codecamp;

public class Checkout {
	
	private int total;
	
	private int pommes;
	
	private int mele;
	
	private int bananas;
	
	private int cherries;
	
	public Checkout() {
		total = 0;
		pommes = 0;
		mele = 0;
		bananas = 0;
		cherries = 0;
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
			
			bananas++;
			
			if (bananas == 2) {
				total -= 150;
				bananas = 0;
			}
		}
		else if ("Cherries".equals(line)) {
			total += 75;
			
			cherries++;
			
			if (cherries == 2) {
				total -= 20;
				cherries = 0;
			}
		}
	}

	public int getTotal() {
		return total;
	}
}
