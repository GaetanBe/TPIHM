package UndoRedo;

import javax.swing.undo.UndoManager;

public class ModeleUndoable extends Modele {
	
	UndoManager undoManager;

	public ModeleUndoable(int entier) throws IntegerOutOfRangeException {
		super(entier);
		
		undoManager = new UndoManager();
	}

	public UndoManager getUndoManager() {
		return undoManager;
	}

}
