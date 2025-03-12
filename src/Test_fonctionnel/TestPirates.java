package Test_fonctionnel;

import java.util.Scanner;

import front.Affichage;
import front.IAffichage;

public class TestPirates {
	public static void main(String[] args) {

		// Affichage affichage = new Affichage();
		// affichage.afficherDebut();
		// String nomjoueur1 = affichage.recupererNomJoueur();
		// String nomJouer = affichage.recupererNomJoueur();
		IAffichage affichage = new Affichage();

		int vieJoueur1 = 5;
		int vieJoueur2 = 5;
		int populariteJoueur1 = 0;
		int populariteJoueur2 = 0;

		// Les joueurs commencent avec une main de 4 cartes de popularité
		String[] mainJoueur1 = { "Carte de Popularité", "Carte de Popularité", "Carte de Popularité",
				"Carte de Popularité" };
		String[] mainJoueur2 = { "Carte de Popularité", "Carte de Popularité", "Carte de Popularité",
				"Carte de Popularité" };

		affichage.afficherDebut();

		String nomJoueur1 = affichage.recupererNomJoueur(1);
		String nomJoueur2 = affichage.recupererNomJoueur(2);

		int nbtour = 1;
		
			affichage.afficherTour(nbtour);

			// Tour de Jack
			affichage.afficherMain(nomJoueur1, mainJoueur1);
			int choix1=affichage.recupererCarte();

			if (choix1 >= 1 && choix1 <= 4) {
				populariteJoueur1++;
				affichage.afficherCartePopularite(nomJoueur1);
			}

			if (populariteJoueur1 >= 5) {
				affichage.afficherGagnant(nomJoueur1);
			}

			// Tour de Barbe Noire
			affichage.afficherMain(nomJoueur2, mainJoueur2);
			int choix2 =affichage.recupererCarte();

			if (choix2 >= 1 && choix2 <= 4) {
				populariteJoueur2++;
				affichage.afficherCartePopularite(nomJoueur2);
			}

			if (populariteJoueur2 >= 5) {
				affichage.afficherGagnant(nomJoueur2);
			}

			affichage.afficherEtatJoueurs(nomJoueur1, vieJoueur1, populariteJoueur1, nomJoueur2, vieJoueur2,
					populariteJoueur2);
			nbtour++;
			affichage.afficherFin();
		}

		

}
