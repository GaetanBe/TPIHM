package Fenetre;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionMoins extends AbstractAction {

	private Modele modele;

	public ActionMoins(Modele m) {
		modele = m;
	}

	public ActionMoins(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionMoins(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			modele.moins();
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}

	}

}
