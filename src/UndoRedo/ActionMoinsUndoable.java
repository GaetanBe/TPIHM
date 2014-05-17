package UndoRedo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionMoinsUndoable extends AbstractAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2285556158042228624L;
	private ModeleUndoable modele;

	public ActionMoinsUndoable(ModeleUndoable m) {
		modele = m;
	}

	public ActionMoinsUndoable(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionMoinsUndoable(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			modele.moins();
			
			MoinsEdit edit = new MoinsEdit(modele);
			modele.getUndoManager().addEdit(edit);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}

	}

}
