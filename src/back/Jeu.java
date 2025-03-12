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
		String nomJoueur2 =affichage.recupererNomJoueur(2);
		Pirate pirate1=new Pirate(nomJoueur1);
		Pirate pirate2=new Pirate(nomJoueur2);
		
	}
	
}
