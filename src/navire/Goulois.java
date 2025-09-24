package navire;

public class Goulois {

	private String nom;
	private int force;

	public Goulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.err.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

}
