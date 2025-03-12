package Test_fonctionnel;

import back.Jeu;
import front.Affichage;
import back.Pirate;
import back.Carte;
import back.CarteAttaque;
import back.CartePopularite;
public class Scenario {
	public static void main(String[] args) {
		Jeu.setAffichage(new Affichage());
		// 2. Récupération des noms
		String nom1 = Jeu.getAffichage().recupererNomJoueur(1);
		String nom2 = Jeu.getAffichage().recupererNomJoueur(2);

		// 3. Création des pirates
		Pirate pirate1 = new Pirate(nom1);
		Pirate pirate2 = new Pirate(nom2);

		// 4. Création de cartes fictives
		Carte c1 = new CartePopularite("Discours", "Fait gagner de la popularité", 1);
		Carte c2 = new CarteAttaque("Canon", "Inflige des dégâts", 2);
		Carte c3 = new CartePopularite("Fête", "Fait plaisir au peuple", 2);
		Carte c4 = new CarteAttaque("Sabotage", "Réduit la défense ennemie", 1);

		// 5. Distribution des cartes (2 pour chaque pirate par exemple)
		pirate1.ajouterCarteDansMain(c1);
		pirate1.ajouterCarteDansMain(c2);
		pirate2.ajouterCarteDansMain(c3);
		pirate2.ajouterCarteDansMain(c4);

		// 6. Début de partie
		Jeu.getAffichage().afficherDebut();

		// 7. Afficher la main du pirate 1
		Jeu.getAffichage().afficherMain(pirate1.getNom(), pirate1.convertirMainEnString());

		// 8. Le pirate 1 joue une carte
		int choix = Jeu.getAffichage().recupererCarte();
		pirate1.poserCarteDansBanc(choix);

		// 9. Afficher le banc du pirate 1
		pirate1.afficherBanc();

		// 10. Fin de partie (pour le test)
		Jeu.getAffichage().afficherFin();
	}
}
