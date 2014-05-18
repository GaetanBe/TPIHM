package UndoRedo;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;

public class TextUndoableEditListener implements UndoableEditListener {
	
	private ModeleUndoable modele;

	public TextUndoableEditListener(ModeleUndoable m) {
		modele = m;
	}

	@Override
	public void undoableEditHappened(UndoableEditEvent arg0) {
		modele.getUndoManager().undoableEditHappened(arg0);
	}

}
