package UndoRedo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoableEdit;

public class ActionPlusUndoable extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3786286331964311595L;
	private ModeleUndoable modele;
	
	public ActionPlusUndoable(ModeleUndoable m) {
		modele = m;
		// TODO Auto-generated constructor stub
	}

	public ActionPlusUndoable(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionPlusUndoable(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			modele.plus();
			
			PlusEdit edit = new PlusEdit(modele);
			modele.getUndoManager().addEdit(edit);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}

}
