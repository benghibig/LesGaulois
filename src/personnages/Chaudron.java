package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forceDePotion) {
		quantitePotion = quantite;
		forcePotion = forceDePotion;
	}
	
	public boolean resterPotion() {
		return quantitePotion != 0;
	}
	
	public int prendreLouche() {
		quantitePotion--;
		return forcePotion;
	}
	
}
