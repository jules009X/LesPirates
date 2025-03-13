package back;

public class Pirate {
	private int pointsDeVie;
	private int popularite;
	private String nom;
	private Pioche pioche;
	private Carte[] main; // La main de 4 cartes
	private int nbCartesMain;
	private int nbCartesBanc;
	private Carte[] banc; // Le banc est ici

	public Pirate(String nom) {
		this.nom = nom;
		this.pointsDeVie = 5; // ou autre valeur de départ
		this.popularite = 0;
		this.main = new Carte[4];
		nbCartesMain = 0;
		banc = new Carte[10];
		nbCartesBanc = 0;
	}

	public void poserCarteDansBanc(int indexMain) {
		if (indexMain < 0 || indexMain >= nbCartesMain) {
			System.out.println("Index invalide !");
			return;
		}
		if (nbCartesBanc >= banc.length) {
			System.out.println("Le banc est plein !");
			return;
		}
		// Poser la carte
		banc[nbCartesBanc++] = main[indexMain];

		// Retirer la carte de la main (en décalant les autres)
		for (int i = indexMain; i < nbCartesMain - 1; i++) {
			main[i] = main[i + 1];
		}
		main[--nbCartesMain] = null;
	}

	public void afficherBanc() {
		System.out.println("Banc de " + nom + " :");
		if (nbCartesBanc == 0) {
			System.out.println("Aucune carte posée.");
		} else {
			for (int i = 0; i < nbCartesBanc; i++) {
				banc[i].afficherCarte();
			}
		}
	}

	public  String getNom() {
		return nom;
	}

	public int getVie() {
		return pointsDeVie;
	}

	public int getPopularite() {
		return popularite;
	}

	public void perdreVie(int degats) {
		pointsDeVie -= degats;
	}

	public void gagnerPopularite(int points) {
		popularite += points;
	}

	public Carte[] getMain() {
		return main;
	}
	public Carte getCarteMain(int index) {
        if (index >= 0 && index < nbCartesMain) {
            return main[index];
        } else {
            System.out.println("Index de carte invalide !");
            return null; // Ou tu peux lancer une exception si tu préfères
        }
    }
	public void ajouterCarteDansMain(Carte carte) {
		if (nbCartesMain < 4) {
			main[nbCartesMain] = carte;
			nbCartesMain++;
		} else {
			System.out.println("La main de " + nom + " est déjà pleine !");
		}
	}

	public String[] convertirMainEnString() {
		String[] resultats = new String[4];
		for (int i = 0; i < 4; i++) {
			if (main[i] != null)
				resultats[i] = main[i].toString();
			else
				resultats[i] = "[Carte vide]";
		}
		return resultats;
	}

}
