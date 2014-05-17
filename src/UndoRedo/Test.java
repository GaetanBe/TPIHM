package UndoRedo;

/**
 * Classe test
 * @author Gaëtan
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Fenetre fenetre1 = new Fenetre("Fenetre");
		
		ModeleUndoable ModeleUndoable1 = null;
		try {
			ModeleUndoable1 = new ModeleUndoable(2);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		fenetre1.pack(); // Recalcule la taille des composants
		fenetre1.setVisible(true); //Fenetre visible
		
		Controller controller = new Controller(ModeleUndoable1,fenetre1);
		
		
		Fenetre fenetre2 = new Fenetre("Fenetre");
		
		ModeleUndoable ModeleUndoable2 = null;
		try {
			ModeleUndoable2 = new ModeleUndoable(8);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		fenetre2.pack(); // Recalcule la taille des composants
		fenetre2.setVisible(true); //Fenetre visible
		
		Controller controller2 = new Controller(ModeleUndoable2,fenetre2);
		
		
		SuperObserver superObserver = new SuperObserver(ModeleUndoable1, ModeleUndoable2);
		ModeleUndoable1.addObserver(superObserver);
		ModeleUndoable2.addObserver(superObserver);
	}

}
