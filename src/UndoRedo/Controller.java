package UndoRedo;

public class Controller {

	public Controller(ModeleUndoable modele, Fenetre fenetre) {
	
		Integer tmp = new Integer(modele.getEntier());
		fenetre.getText().setText(tmp.toString());
		
		ActionMoinsUndoable ActionMoinsUndoable = new ActionMoinsUndoable(modele);
		ActionPlusUndoable ActionPlusUndoable = new ActionPlusUndoable(modele);
		ActionTexte actionTexte = new ActionTexte(modele, fenetre);
		ActionUndo undo = new ActionUndo(modele);
		ActionRedo redo = new ActionRedo(modele);
		
		//liens
		fenetre.getText().addActionListener(actionTexte);
		fenetre.getBoutonPlus().addActionListener(ActionPlusUndoable);
		fenetre.getBoutonMoins().addActionListener(ActionMoinsUndoable);
		fenetre.getBoutonUndo().addActionListener(undo);
		fenetre.getBoutonRedo().addActionListener(redo);
		
		//Oberservateurs
		IntegerObserver obs = new IntegerObserver(fenetre);
		modele.addObserver(obs);
	}

}
