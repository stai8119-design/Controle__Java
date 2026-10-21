package evaluation;

public abstract class Livreur {

	protected String identifiant;
	protected String nom;
	protected double tarifKm;
	protected Livreur superieur;

	public Livreur(String identifiant, String nom, double tarifKm) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}

	public Livreur getSuperieur() {
		return superieur;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public abstract double calculerFrais(double distance);

	public void afficherDetails() {
		System.out.println("Identifiant:" + identifiant + ",nom:" + nom + ",le tarif:" + tarifKm + ".");
	}

}
