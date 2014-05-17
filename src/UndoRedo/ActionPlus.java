package UndoRedo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoableEdit;

public class ActionPlus extends AbstractAction implements UndoableEdit {
	
	private Modele modele;

	public ActionPlus(Modele m) {
		modele = m;
	}

	public ActionPlus(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionPlus(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			modele.plus();
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public boolean addEdit(UndoableEdit arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPresentationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRedoPresentationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUndoPresentationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSignificant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void redo() throws CannotRedoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean replaceEdit(UndoableEdit arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() throws CannotUndoException {
		// TODO Auto-generated method stub
		
	}

}
