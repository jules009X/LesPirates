package back;

import front.Affichage;
import front.IAffichage;

public class Jeu {
	private static IAffichage affichage;

	public static IAffichage getAffichage() {
		return affichage;
	}

	public static void setAffichage(IAffichage affichage) {
		Jeu.affichage = affichage;
	}

	public void jouerPirate() {
		affichage.afficherDebut();
		String nomJoueur1 = affichage.recupererNomJoueur(1);
		String nomJoueur2 = affichage.recupererNomJoueur(2);
		Pirate pirate1 = new Pirate(nomJoueur1);
		Pirate pirate2 = new Pirate(nomJoueur2);

	}

	public static void lancerPartie() {
		String nom1 = Jeu.getAffichage().recupererNomJoueur(1);
		String nom2 = Jeu.getAffichage().recupererNomJoueur(2);
		Pioche pioche = new Pioche();
		Pirate pirate1 = new Pirate(nom1);
		Pirate pirate2 = new Pirate(nom2);
		pioche.remplirPioche();

		for (int i = 0; i < 4; i++) {
			Carte cartePiochee = pioche.piocherCarte();
			if (cartePiochee != null) {
				pirate1.ajouterCarteDansMain(cartePiochee);
			}
		}
		for (int j = 0; j < 4; j++) {
			Carte cartePiochee1 = pioche.piocherCarte();
			if (cartePiochee1 != null) {
				pirate2.ajouterCarteDansMain(cartePiochee1);
			}
		}
			int tour = 1;
			boolean jeuEnCours = true;

			while (jeuEnCours) {
				Jeu.affichage.afficherTour(tour);

				// Tour du joueur 1
				jouerUnTour(pirate1, pirate2, pioche);
				if (pirate1.getPopularite() >= 5 || pirate2.getVie() <= 0) {
					Jeu.affichage.afficherGagnant(pirate1.getNom());
					jeuEnCours=false;
					break;
				}

				// Tour du joueur 2
				jouerUnTour(pirate2, pirate1, pioche);
				if (pirate2.getPopularite() >= 5 || pirate1.getVie() <= 0) {
					Jeu.affichage.afficherGagnant(pirate2.getNom());
					jeuEnCours=false;
					break;
				}

				tour++;
			}

			Jeu.affichage.afficherFin();
		}
	

	private static void jouerUnTour(Pirate joueur, Pirate adversaire, Pioche pioche) {
		Carte piochee = pioche.piocherCarte();
		if (piochee == null)
			return; // plus de cartes

		joueur.ajouterCarteDansMain(piochee);

		Carte[] main = joueur.getMain();
		Jeu.affichage.afficherMain(joueur.getNom(), joueur.convertirMainEnString());

		int choix = Jeu.affichage.recupererCarte(); // ex : 1 à 4
		Carte carteChoisie = joueur.getCarteMain(choix - 1);

		if (carteChoisie instanceof CartePopularite) {
			CartePopularite pop = (CartePopularite) carteChoisie;
			joueur.gagnerPopularite(pop.getPopularite());
			joueur.poserCarteDansBanc(choix - 1);
		} 
		if (carteChoisie instanceof CarteSpeciale) {
			
			joueur.setPointsDeVie(adversaire.getPointsDeVie());
			joueur.setPopularite(adversaire.getPopularite());
			joueur.poserCarteDansBanc(choix - 1);
		}
		if (carteChoisie instanceof CarteMagic) {
			CarteMagic magic = (CarteMagic) carteChoisie;
			adversaire.perdreVie(magic.getNbeffet());
			joueur.gagnerPopularite(magic.getPopularite());
			joueur.poserCarteDansBanc(choix - 1);
		}

		Jeu.affichage.afficherEtatJoueurs(joueur.getNom(), joueur.getVie(), joueur.getPopularite(), adversaire.getNom(),
				adversaire.getVie(), adversaire.getPopularite());
	}
}
