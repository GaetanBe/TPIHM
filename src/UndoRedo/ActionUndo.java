package UndoRedo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionUndo extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8916069297362948365L;
	ModeleUndoable modele;

	public ActionUndo(ModeleUndoable m) {
		modele = m;
	}

	public ActionUndo(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionUndo(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		modele.getUndoManager().undo();
	}

}
