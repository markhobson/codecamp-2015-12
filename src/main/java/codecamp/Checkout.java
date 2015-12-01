package codecamp;

public class Checkout {
	
	private int total;
	
	private int apples;
	
	private int pommes;
	
	private int mele;
	
	private int bananas;
	
	private int cherries;
	
	public Checkout() {
		total = 0;
		apples = 0;
		pommes = 0;
		mele = 0;
		bananas = 0;
		cherries = 0;
	}
	
	public void scan(String line) {
		for (String item : line.split(",")) {
			scanItem(item.trim());
		}
	}

	private void scanItem(String item) {
		switch (item) {
			case "Apples":
				scanApples();
				break;
				
			case "Pommes":
				scanPommes();
				break;
				
			case "Mele":
				scanMele();
				break;
				
			case "Bananas":
				scanBananas();
				break;
				
			case "Cherries":
				scanCherries();
				break;
				
			default:
				break;
		}
	}

	private void scanApples() {
		total += 100;
		apples++;

		appleAdded();
	}

	private void scanPommes() {
		total += 100;
		pommes++;
		
		appleAdded();
		
		if (pommes % 3 == 0) {
			total -= 100;
		}
	}

	private void scanMele() {
		total += 100;
		mele++;
		
		appleAdded();
		
		if (mele % 2 == 0) {
			total -= 50;
		}
	}

	private void scanBananas() {
		total += 150;
		bananas++;
		
		fruitAdded();
		
		if (bananas % 2 == 0) {
			total -= 150;
		}
	}

	private void scanCherries() {
		total += 75;
		cherries++;
		
		fruitAdded();
		
		if (cherries % 2 == 0) {
			total -= 20;
		}
	}

	private void appleAdded() {
		if (getAppleCount() % 4 == 0) {
			total -= 100;
		}
		
		fruitAdded();
	}

	private void fruitAdded() {
		if (getFruitCount() % 5 == 0) {
			total -= 200;
		}
	}

	private int getAppleCount() {
		return apples + pommes + mele;
	}
	
	private int getFruitCount() {
		return getAppleCount() + bananas + cherries;
	}

	public int getTotal() {
		return total;
	}
}
