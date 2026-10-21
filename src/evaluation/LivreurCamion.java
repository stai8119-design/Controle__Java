package evaluation;

public class LivreurCamion extends Livreur {
	private double tauxMajoration;

	public LivreurCamion(String identifiant, String nom, double tarifKm, double tauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.tauxMajoration = tauxMajoration;
	}

	@Override
	public double calculerFrais(double distance) {
		return (tarifKm * distance) * (1 + tauxMajoration);
	}

}
