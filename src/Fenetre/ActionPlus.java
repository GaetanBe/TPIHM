package Fenetre;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionPlus extends AbstractAction {
	
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

}
