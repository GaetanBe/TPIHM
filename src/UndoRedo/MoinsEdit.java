package UndoRedo;

import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;

public class MoinsEdit extends AbstractUndoableEdit {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7972985442099140081L;
	private ModeleUndoable modele;

	public MoinsEdit(ModeleUndoable m) {
		modele = m;
	}
	
	@Override
	public boolean canRedo() {
		super.canRedo();
		return !(modele.getEntier() == 0);
	}

	@Override
	public boolean canUndo() {
		super.canUndo();
		return !(modele.getEntier() == 10);
	}
	
	@Override
	public String getPresentationName() {
		return "Moins";
	}

	@Override
	public String getRedoPresentationName() {
		return "Moins 1";
	}

	@Override
	public String getUndoPresentationName() {
		return "Plus 1";
	}
	
	@Override
	public void redo() throws CannotRedoException {
		super.redo();
		if(!this.canRedo())
		{
			throw new CannotRedoException();
		}
		else{
			try {
				modele.moins();
			} catch (IntegerOutOfRangeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void undo() throws CannotUndoException {
		super.undo();
		if(!this.canUndo())
		{
			throw new CannotRedoException();
		}
		else{
			try {
				modele.plus();
			} catch (IntegerOutOfRangeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
