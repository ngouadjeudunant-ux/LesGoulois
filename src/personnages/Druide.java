package personnages;

public class Druide {

	private String nom;
	private int force;
	private Chaudron chaudron;

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + ": ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {

		chaudron.remplirChaudron(quantite, forcePotion);
		System.out.println("J'ai concocté" + quantite + "doses de potion magique. Elle a une force de " + forcePotion);

	}

	public void booster(Gaulois gaulois) {
		boolean cotientPotion = chaudron.resterPotion(); 
		String nomGaulois = gaulois.getNom(); 
		
		if(cotientPotion) {
			if(nomGaulois.equals("Obélix")){
				parler("Non, " + nomGaulois + "Non!..Et tu le sais très bien!"); 
				 
			}else {
				int forcePotion = chaudron.prendreLouche(); 
				gaulois.boirePotion(forcePotion);
				parler("Tiens" + nomGaulois + "un peu de potion magique.");
				
			}
		}else {
			parler("Desolé" + nomGaulois + "il n'y a plus une seule goutte de potion");
		}
	}

	public String getNom() {
		return "Le Druide : " + nom;
	}

}
