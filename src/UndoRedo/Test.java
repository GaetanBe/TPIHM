package UndoRedo;

/**
 * Classe test
 * @author Gaëtan
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Fenetre fenetre1 = new Fenetre("Fenetre");
		
		Modele modele1 = null;
		try {
			modele1 = new Modele(2);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		fenetre1.pack(); // Recalcule la taille des composants
		fenetre1.setVisible(true); //Fenetre visible
		
		Controller controller = new Controller(modele1,fenetre1);
		
		
		Fenetre fenetre2 = new Fenetre("Fenetre");
		
		Modele modele2 = null;
		try {
			modele2 = new Modele(8);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		fenetre2.pack(); // Recalcule la taille des composants
		fenetre2.setVisible(true); //Fenetre visible
		
		Controller controller2 = new Controller(modele2,fenetre2);
		
		
		SuperObserver superObserver = new SuperObserver(modele1, modele2);
		modele1.addObserver(superObserver);
		modele2.addObserver(superObserver);
	}

}
