package back;

public class Pioche {
	private Carte[] cartes; // Tableau contenant toutes les cartes
	private int nbCartes; // Nombre de cartes encore disponibles

	public Pioche() {
		cartes = new Carte[20]; // Taille maximale de la pioche (modifiable)
		nbCartes = 0;
	}

	// Remplir la pioche avec des cartes
	public void remplirPioche() {
		// Exemple d'ajout de cartes (4 cartes ici, tu peux en mettre plus)
		cartes[nbCartes++] = new CarteAttaque("Canon", "Inflige 1 dégât", 1);
		cartes[nbCartes++] = new CartePopularite("Fête", "Gagne 1 popularité", 1);
		cartes[nbCartes++] = new CarteAttaque("Sabotage", "Retire 1 carte à l'ennemi", 1);
		cartes[nbCartes++] = new CartePopularite("Discours", "Inspire les foules", 2);
		// Continue à ajouter tes autres cartes ici
	}

	// Mélanger la pioche manuellement
	public void melanger() {
		for (int i = 0; i < nbCartes; i++) {
			int j = (int) (Math.random() * nbCartes);
			Carte temp = cartes[i];
			cartes[i] = cartes[j];
			cartes[j] = temp;
		}
	}

	// Piocher une carte (retire la première carte disponible)
	public Carte piocher() {
		if (nbCartes == 0) {
			System.out.println("La pioche est vide !");
			return null;
		}

		Carte cartePiochee = cartes[0];

		// Décalage des cartes vers la gauche
		for (int i = 0; i < nbCartes - 1; i++) {
			cartes[i] = cartes[i + 1];
		}
		cartes[nbCartes - 1] = null;
		nbCartes--;

		return cartePiochee;
	}

	// (Optionnel) Affiche les cartes restantes dans la pioche
	public void afficherPioche() {
		System.out.println("Cartes restantes dans la pioche : " + nbCartes);
		for (int i = 0; i < nbCartes; i++) {
			System.out.print("[" + (i + 1) + "] ");
			cartes[i].afficherCarte();
		}
	}
}
