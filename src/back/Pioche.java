package back;

public class Pioche {
	private Carte[] cartes; // Tableau contenant toutes les cartes
	private int nbCartes; // Nombre de cartes encore disponibles
	private int indexProchaineCarte = 0;

	public Pioche() {
		cartes = new Carte[30]; // Taille maximale de la pioche (modifiable)
		nbCartes = 0;
	}

	// Remplir la pioche avec des cartes
	public void remplirPioche() {
		// Exemple d'ajout de cartes (4 cartes ici, tu peux en mettre plus)
		cartes[nbCartes++] = new CarteAttaque("Canon", "Inflige 1 dégât", 1);
		cartes[nbCartes++] = new CartePopularite("Fête", "Gagne 1 popularité", 1);
		cartes[nbCartes++] = new CarteAttaque("Sabotage", "Retire 1 carte à l'ennemi", 1);
		cartes[nbCartes++] = new CartePopularite("Discours", "Inspire les foules", 2);
		cartes[nbCartes++] = new CartePopularite("Discours enflammé", "Augmente l'engouement du peuple", 1);
		cartes[nbCartes++] = new CartePopularite("Grande parade", "Les gens sont ravis", 2);
		cartes[nbCartes++] = new CartePopularite("Don au peuple", "Le peuple applaudit votre générosité", 1);
		cartes[nbCartes++] = new CartePopularite("Bal populaire", "Vous devenez très aimé", 2);
		cartes[nbCartes++] = new CartePopularite("Fête des pirates", "Fait la une du journal !", 3);
		cartes[nbCartes++] = new CarteAttaque("Attaque surprise", "Inflige des dégâts inattendus", 1);
		cartes[nbCartes++] = new CarteAttaque("Sabotage", "Endommage les défenses ennemies", 2);
		cartes[nbCartes++] = new CarteAttaque("Feu de canon", "Tire sur le navire adverse", 2);
		cartes[nbCartes++] = new CarteAttaque("Invasion", "Grosse attaque frontale", 3);
		cartes[nbCartes++] = new CarteAttaque("Coup de grâce", "Attaque finale puissante", 4);
		cartes[nbCartes++] = new CartePopularite("Élection truquée", "Le peuple croit en vous", 2);
		cartes[nbCartes++] = new CartePopularite("Discours héroïque", "Émeut les citoyens", 3);
		cartes[nbCartes++] = new CartePopularite("Feu d'artifice", "Spectacle grandiose", 2);
		cartes[nbCartes++] = new CarteAttaque("Boarding", "Montez à bord et volez une carte", 2);
		cartes[nbCartes++] = new CarteAttaque("Explosion", "Cause des dégâts massifs", 3);
		cartes[nbCartes++] = new CarteAttaque("Tir précis", "Affaiblit l'ennemi", 1);
		cartes[nbCartes++] = new CartePopularite("Soutien populaire", "Le peuple vous adore", 3);
		cartes[nbCartes++] = new CarteAttaque("Tactique rusée", "Prend l'ennemi par surprise", 2);
		cartes[nbCartes++] = new CarteMagic("Magie des vents", "Inflige 3 dégâts et augmente la popularité", 3, 2);
		cartes[nbCartes++] = new CarteMagic("Flamme magique", "Inflige 5 dégâts et réduit la popularité de l'adversaire", 5, -1);
		cartes[nbCartes++] = new CarteMagic("Onde d'énergie", "Inflige 2 dégâts, gain de popularité", 2, 1);
		cartes[nbCartes++] = new CarteMagic("Tempête d'étoiles", "Inflige 1 dégât et augmente fortement la popularité", 1, 3);
		cartes[nbCartes++] = new CarteSpeciale("Échange magique", "Échange une carte avec un adversaire", "Échange");
		cartes[nbCartes++] = new CarteSpeciale("Protection divine", "Protège un joueur contre une attaque", "Défense");
		cartes[nbCartes++] = new CarteSpeciale("Attaque surprise", "Inflige des dégâts inattendus à l'ennemi", "Attaque");
		cartes[nbCartes++] = new CarteSpeciale("Vol de trésor", "Permet de voler une carte à l'ennemi", "Vol");
		
	}

	
	
	public Carte piocherCarte() {
		if (indexProchaineCarte < nbCartes) {
			Carte carte = cartes[indexProchaineCarte];
			cartes[indexProchaineCarte] = null;
			indexProchaineCarte++;
			return carte;
		} else {
			System.out.println("La pioche est vide !");
			return null;
		}
	}

	// (Optionnel) Affiche les cartes restantes dans la pioche

	public void afficherPioche() {
		System.out.println("Cartes restantes dans la pioche : " + (nbCartes - indexProchaineCarte));
		for (int i = indexProchaineCarte; i < nbCartes + indexProchaineCarte; i++) {
			if (cartes[i] != null) {
				System.out.print("[" + (i + 1) + "] ");
				cartes[i].afficherCarte();
			}

		}
	}
}
