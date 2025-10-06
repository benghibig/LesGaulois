package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force*effetPotion / 3);
		if(effetPotion > 1) {
			effetPotion--;
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}
	
	public void sePresenter() {
		if(village == null) parler("Bonjour, je m'appelle "+getNom()+". Je voyage de villages en villages.");
		else parler("Bonjour, je m'appelle "+getNom()+". J'habite le village "+village.getNom()+ ".");
	}

	public String toString() {
		return  nom;
	}
	
	
	
	
	
}
