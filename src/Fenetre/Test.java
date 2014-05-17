package Fenetre;


public class Test {

	public static void main(String[] args) {
		
		Fenetre fenetre = new Fenetre("Fenetre");
		IntegerObserver observer = new IntegerObserver(fenetre);
		Modele modele = null;
		try {
			modele = new Modele(2, observer);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		fenetre.pack(); // Recalcule la taille des composants
		fenetre.setVisible(true); //Fenetre visible
		
		Controller controller = new Controller(modele,fenetre);
	}

}
