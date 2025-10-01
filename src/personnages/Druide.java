package personnages;

public class Druide {
	private static final int NBCHAUDRON = 1;
	private String nom;
	private int force;
	Chaudron[] chaudron = new Chaudron[NBCHAUDRON];
	
	
	public String getNom() {
		return nom;
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if(chaudron[0].resterPotion()) {
			if(nomGaulois.equals("Obélix")) {
				parler("Non, " + nomGaulois + " Non!... Et tu le sais très bien!");
			}
			else {
				int forcePotion = chaudron[0].prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}
		}
		else {
			parler("Désolé " + nomGaulois + " il n'y a plus une seul goutte de potion.");
		}
		
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron[0].remplirChaudron(quantite, forcePotion);
		String texte = "J'ai concocté " + quantite + " doses de potion magique. "
				+ "Elle a une force de " + forcePotion + ".";
		parler(texte);
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" +  texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + getNom() + ": ";
	}
	
	
}
