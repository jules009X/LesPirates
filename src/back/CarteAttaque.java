package back;


public class CarteAttaque extends Carte {
	private int nbEffet;

	public CarteAttaque(String nomCarte, String description, int nbEffet) {
		super(nomCarte, description); // Appel correct au constructeur de Carte
		this.nbEffet = nbEffet;
	}
	@Override
	public void afficherCarte() {
		super.afficherCarte(); // Affiche nom + description
		System.out.println("Nombre d'effets d'attaque : " + nbEffet);
		
	}
}