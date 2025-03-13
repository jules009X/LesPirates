package front;

import java.util.Scanner;

public class Affichage implements IAffichage {

	Scanner scanner = new Scanner(System.in);
	// public void afficherDebut() {
	// System.out.println("Bienvenue dans le jeu des pirates ");

	// }

	// public void afiicherDistrubutionCartes() {
	// System.out.println("Vos cartes sont les suivantes : ");

	// }

	// public void afficherCartes(String[] cartes) {
	// System.out.println("voici vos cartes ");
	// for (int i = 0; i < cartes.length; i++) {
	// System.out.println(cartes[i]);
	// }

	// }

	@Override
	public String recupererNomJoueur(int numeroJoueur) {
		System.out.println("Veuillez entrer votre nom joueur " + numeroJoueur + ": \n");
		String nomJoueur = scanner.next();
		return nomJoueur;
	}

	// public void afficherMessage(String message) {
	// System.out.println(message);
	// }
	@Override
	public void afficherDebut() {
		System.out.println("Bienvenue dans le jeu des pirates ");
		System.out.println("\"Le premier à 5 points de popularité ou à éliminer son adversaire gagne !\"");
	}

	@Override
	public void afficherFin() {
		System.out.println("\n=== Fin du jeu ===");
	}

	@Override
	public void afficherEtatJoueurs(String nom1, int vie1, int pop1, String nom2, int vie2, int pop2) {
		System.out.println("\n--- État des joueurs ---");
		System.out.println(nom1 + " : " + vie1 + " PV, " + pop1 + " Popularité");
		System.out.println(nom2 + " : " + vie2 + " PV, " + pop2 + " Popularité");
	}

	@Override
	public int recupererCarte() {
		System.out.println("Choisissez une carte en tapant son numéro :");
		int choix = scanner.nextInt();
		return choix;
	}

	@Override
	public void afficherTour(int tour) {
		System.out.println("\n--- Tour " + tour + " ---");
	}


	@Override
	public void afficherMain(String nom, String[] main) {
		System.out.println("Main de " + nom + " :");
		for (int i = 0; i < main.length; i++) {
			if (main[i] != null) {
			System.out.println("[" + (i + 1) + "] " + main[i].toString()); // toString() affiche la carte proprement
			}
		}
	}
	@Override
	public void afficherCartePopularite(String nomJoueur1) {
		System.out.println(nomJoueur1 + " a posé une carte de popularité !");
	}

	@Override
	public void afficherGagnant(String nom) {
		System.out.println("🏆 Le gagnant est " + nom + " !");
	}

}