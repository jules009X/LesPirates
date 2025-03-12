package back;

public class Main {
	private Carte[] main;
	private int nbCartes; 

	public Main() {
		main = new Carte[4];
		nbCartes = 0;
	}

	// Ajoute une carte à la main si elle n’est pas pleine
	public void ajouterCarte(Carte carte) {
		if (nbCartes < 4) {
			main[nbCartes] = carte;
			nbCartes++;
		} else {
			System.out.println("La main est déjà pleine !");
		}
	}

	// Affiche toutes les cartes dans la main
	public void afficherMain() {
		System.out.println("Main du joueur :");
		for (int i = 0; i < nbCartes; i++) {
			System.out.println("Carte " + (i + 1) + " :");
			main[i].afficherCarte();
		}
	}

	// (optionnel) récupérer une carte spécifique
	public Carte getCarte(int index) {
		if (index >= 0 && index < nbCartes) {
			return main[index];
		}
		System.out.println("Index invalide !");
		return null;
	}
}
