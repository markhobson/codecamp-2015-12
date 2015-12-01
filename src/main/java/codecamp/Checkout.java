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
			scanApples();
		}
		else if ("Pommes".equals(line)) {
			scanPommes();
		}
		else if ("Mele".equals(line)) {
			scanMele();
		}
		else if ("Bananas".equals(line)) {
			scanBananas();
		}
		else if ("Cherries".equals(line)) {
			scanCherries();
		}
	}

	private void scanApples() {
		total += 100;
	}

	private void scanPommes() {
		total += 100;
		
		pommes++;
		
		if (pommes == 3) {
			total -= 100;
			pommes = 0;
		}
	}

	private void scanMele() {
		total += 100;
		
		mele++;
		
		if (mele == 2) {
			total -= 50;
			mele = 0;
		}
	}

	private void scanBananas() {
		total += 150;
		
		bananas++;
		
		if (bananas == 2) {
			total -= 150;
			bananas = 0;
		}
	}

	private void scanCherries() {
		total += 75;
		
		cherries++;
		
		if (cherries == 2) {
			total -= 20;
			cherries = 0;
		}
	}

	public int getTotal() {
		return total;
	}
}
