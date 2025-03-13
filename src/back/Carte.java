package back;

public abstract class Carte {
	protected String nomCarte;
	protected String description;

	public Carte(String nomCarte, String description) {
		this.nomCarte = nomCarte;
		this.description = description;
	}

	public String getNomCarte() {
		return nomCarte;
	}

	public String getDescription() {
		return description;
	}

	// Méthode abstraite que les sous-classes doivent implémenter

	protected void afficherCarte() {
		System.out.println("Nom de la carte : " + nomCarte);
		System.out.println("Description : " + description);
	}

	@Override
	public String toString() {
		return nomCarte + " : " + description;
	}
}