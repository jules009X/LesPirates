package back;

public class CarteMagic extends Carte {
	private int nbEffet; 
	private int popularite;// Peut être positif ou négatif
   



    public CarteMagic(String nom, String description, int nbEffet, int popularite) {
        super(nom, description);
        this.nbEffet = nbEffet;
        this.popularite = popularite;
    }

    @Override
	public void afficherCarte() {
		super.afficherCarte(); // Affiche nom + description
		System.out.println("Nombre d'effets d'attaque : " + nbEffet+"Points de popularité : " + popularite);

	}
    public int getNbeffet(){
    	return nbEffet;
    }
	@Override
	public String toString() {
		return super.toString() + " (Effet : " + nbEffet + ")"+" (Popularité : " + popularite + ")";
	}
	

	public int getPopularite() {
		return popularite;
	}
    
}
