package evaluation;

public class Livraison {

	private Livreur livreur;
	private Commande commande;
	private double distance;

	public Livraison(Livreur livreur, Commande commande, double distance) {
		this.livreur = livreur;
		this.commande = commande;
		this.distance = distance;
	}

	public double calculerMontant() {
		return livreur.calculerFrais(distance);
	}

	public void afficherRecapitulatif() {
		System.out.println("Affichage de recapitulatif");
		System.out.println("INFORMATIONS DE LIVREUR:");
		livreur.afficherDetails();
		System.out.println("INFORMATIONS DE LA COMMANDE:");
		System.out.println(commande.toString());
		System.out.println("DISTANCE PARCOURUS:" + distance);
		System.out.println("MONTANT DE LIVRAISON:");
		System.out.println(calculerMontant());
	}
}
