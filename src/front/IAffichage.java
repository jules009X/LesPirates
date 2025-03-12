package front;

public interface IAffichage {

	String recupererNomJoueur(int numeroJoueur);

	// public void afficherMessage(String message) {
	// System.out.println(message);
	// }
	void afficherDebut();

	void afficherFin();

	void afficherEtatJoueurs(String nom1, int vie1, int pop1, String nom2, int vie2, int pop2);

	void afficherMain(String nom, String[] main);

	int recupererCarte();

	void afficherCartePopularite(String nomJoueur1);

	void afficherGagnant(String nom);

	void afficherTour(int tour);

}