/*
 * Created on 18.12.2005
 */

package kapitel_15;

class BankKonto {
	private int kontostand = 100;
	public int getKontostand() {
		return kontostand;
	}
	public void abbuchen(int betrag) {
		kontostand = kontostand - betrag;
	}
}

public class RainerUndMonika implements Runnable {
	
	private BankKonto konto = new BankKonto();
	
	public static void main (String [] args) {
		RainerUndMonika derJob = new RainerUndMonika();
		Thread eins = new Thread(derJob);
		Thread zwei = new Thread(derJob);
		eins.setName("Rainer");
		zwei.setName("Monika");
		eins.start();
		zwei.start();
	}
	
	public void run() {
		for (int x = 0; x < 10; x++) {
			abhebungMachen(10);
			if (konto.getKontostand() < 0) {
				System.out.println("Überzogen!");
			}
		}
	}
	
	private void abhebungMachen(int betrag) {
		if (konto.getKontostand() >= betrag) {
			System.out.println(Thread.currentThread().getName() + " will abheben.");
			try {
				System.out.println(Thread.currentThread().getName() + " schläft ein.");
				Thread.sleep(500);
			} catch(InterruptedException ex) {ex.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() + " ist aufgewacht.");
			konto.abbuchen(betrag);
			System.out.println(Thread.currentThread().getName() + " führt die Abhebung zu Ende.");
		}
		else {
			System.out.println("Leider nicht genug Geld für " + Thread.currentThread().getName());
		}
	}
}
