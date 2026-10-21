package evaluation;

public class Main {
	public static void main(String[] args) {

		LivreurMoto lm1 = new LivreurMoto("EE", "Ali", 10.0, 4);
		LivreurMoto lm2 = new LivreurMoto("AA", "Sara", 8.0, 2);

		LivreurCamion lc1 = new LivreurCamion("SSS", "Ahmed", 15.0, 0.2);
		LivreurCamion lc2 = new LivreurCamion("RR", "Amin", 12.0, 0.10);

		Livreur[] T1 = { lm1, lm2, lc1, lc2 };

		Commande c1 = new Commande("20", "AAAAAAAA");
		Commande c2 = new Commande("15", "CCCCC");

		Livraison L1 = new Livraison(lm1, c1, 30.0);
		Livraison L2 = new Livraison(lm2, c1, 20.0);
		Livraison L3 = new Livraison(lc1, c2, 40.0);
		Livraison L4 = new Livraison(lc2, c2, 50.0);

		Livraison[] T2 = { L1, L2, L3, L4 };

		System.out.println("RECAPITULATIF DES LIVRAISONS");
		for (int i = 0; i < T2.length; i++) {
			T2[i].afficherRecapitulatif();
		}

		double montantTotal = 0;
		for (Livraison L : T2) {
			montantTotal += L.calculerMontant();
		}
	}

}
