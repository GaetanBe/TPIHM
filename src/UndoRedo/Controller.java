package UndoRedo;

public class Controller {

	public Controller(Modele modele, Fenetre fenetre) {
	
		Integer tmp = new Integer(modele.getEntier());
		fenetre.getText().setText(tmp.toString());
		
		ActionMoins actionMoins = new ActionMoins(modele);
		ActionPlus actionPlus = new ActionPlus(modele);
		ActionTexte actionTexte = new ActionTexte(modele, fenetre);
		
		//liens
		fenetre.getText().addActionListener(actionTexte);
		fenetre.getBoutonPlus().addActionListener(actionPlus);
		fenetre.getBoutonMoins().addActionListener(actionMoins);
		
		//Oberservateurs
		IntegerObserver obs = new IntegerObserver(fenetre);
		modele.addObserver(obs);
	}

}
