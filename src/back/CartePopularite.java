package back;

public class CartePopularite extends Carte{
	private int popularite;

	public CartePopularite(String nomCarte, String description, int popularite) {
		super(nomCarte, description); // Appel correct au constructeur de Carte
		this.popularite = popularite;
	}
	@Override
	public void afficherCarte() {
		super.afficherCarte(); // Affiche nom + description
		System.out.println("Points de popularité : " + popularite);
		
	}
}
