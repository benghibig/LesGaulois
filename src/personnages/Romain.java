package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	public String getNom() {
		return nom;
	}
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceDuCoup) {
		assert forceDuCoup > 0;
		int forceAvant = force;
		force = force - forceDuCoup;
		
		if(force < 1) {
			parler("J'abandonne !");
		}
		else {
			parler("Aïe");
		}
		assert force > forceAvant;
		assert isInvariantVerified();
		
		
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
