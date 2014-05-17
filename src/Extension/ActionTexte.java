package Extension;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ActionTexte extends AbstractAction {

	private Modele modele;
	private Fenetre fenetre;

	public ActionTexte(Modele m, Fenetre fenetre) {
		modele = m;
		this.fenetre = fenetre;
	}
	
	public ActionTexte() {
		// TODO Auto-generated constructor stub
	}

	public ActionTexte(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ActionTexte(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Integer tmp = new Integer(fenetre.getText().getText());
			modele.setEntier(tmp);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}

}
