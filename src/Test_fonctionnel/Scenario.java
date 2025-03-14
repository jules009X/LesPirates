package Test_fonctionnel;

import back.Jeu;
import front.Affichage;
import back.Pirate;
import back.Carte;
import back.CarteAttaque;
import back.CartePopularite;
import back.Pioche;

public class Scenario {
	public static void main(String[] args) {
		
		Jeu.setAffichage(new Affichage());

		Jeu.getAffichage().afficherDebut();
	
		
      Jeu.lancerPartie();
		
		

	}
}
