package UndoRedo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionRedo extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1442628469631231850L;
	ModeleUndoable modele;

	public ActionRedo(ModeleUndoable m) {
		modele = m;
	}

	public ActionRedo(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionRedo(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		modele.getUndoManager().redo();
	}

}
