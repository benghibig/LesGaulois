package personnages;

public class Village {
	 private String nom;
	 private int nbVillageois = 0;
	 private Gaulois chef;
	 private Gaulois[] villageois;
	 
	 public Village(String nom, Gaulois chef,int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	 public String getNom() {
		 return nom;
	 }
	 public Gaulois getChef() {
		 return chef;
	 }
	 
	 public void ajouterVillageois(Gaulois gaulois)  {
			if(this.nbVillageois < villageois.length) {
				villageois[nbVillageois] = gaulois;
				nbVillageois++;
				gaulois.setVillage(this);
			}
	}
	 public Gaulois trouverVillageois(int indice) {
		if(1<=indice && indice <= nbVillageois) {
			return this.villageois[indice-1];
		}
		else if(indice - 1 >= this.nbVillageois) {
			(this.chef).parler("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		else
			return null;		
	}
	 
	 public void afficherVillage() {
		System.out.println("Dans le village "+ this.getNom() +" du chef "+ chef.getNom() 
				+ " vivent les légendaires gaulois :");
		for(int i  = 0; i < nbVillageois;i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	 
	 
	 public static void main(String[] args) {
		
		
		
		
		Gaulois abraracourix = new Gaulois("Abraracourcix",8);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix =  new Gaulois("Obélix", 25);
		Gaulois doublePolemix = new Gaulois("DoublePolémix",4);
		
		Village village = new Village("Village des Irréductibles",abraracourix,30);
		
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		
		abraracourix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
	}
	 
	 
	 
}
