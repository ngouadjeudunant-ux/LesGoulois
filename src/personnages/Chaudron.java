package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {

		quantitePotion += quantite;
		forcePotion += forcePotion;
		System.out.println("J'ai concocté " + quantite + "doses de potion magique. Elle a une force de " + forcePotion);
	}

	public boolean resterPotion() {
		if (quantitePotion > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int prendreLouche() {
		return forcePotion;
	}

}
